package Encapsulation;


class  Student{
    private int id;

    private void show(){
        System.out.println("student "+id);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<10) {
            this.id = id;
        }
        else{
            System.out.println("not set");
        }
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(11);
        System.out.println(s.getId());

    }
}
