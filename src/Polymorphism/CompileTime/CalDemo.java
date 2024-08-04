package Polymorphism.CompileTime;

class Cal {

    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b , int c){
        return a+b+c;
    }
    float add(Float a , int b){
        return a+b;
    }

}


public class  CalDemo{
    public static void main(String[] args) {
        Cal addition = new Cal();
        System.out.println( addition.add(2,3));
        System.out.println(addition.add(2 ,3 , 5));
        System.out.println(addition.add(2.3f ,3));
    }
}
