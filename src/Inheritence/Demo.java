package Inheritence;


class Parent {
    void walk(){
        System.out.println("walking");
    }
}


class  Child extends Parent{
    void Cry(){
        System.out.println("ooooooowwwhhh");
    }
}

public class Demo{
    public static void main(String[] args) {

        Child munna = new Child();
        munna.walk();
        munna.Cry();

    }
}
