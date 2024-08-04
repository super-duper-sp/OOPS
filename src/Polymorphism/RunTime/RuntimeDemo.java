package Polymorphism.RunTime;


class  A{
    void show(){
        System.out.println("showing in A");
    }
}

class B extends A{

    @Override
    void show() {
        super.show();
        System.out.println("showing in B");
    }
}

public class RuntimeDemo {
    public static void main(String[] args) {
        B b = new B();
        b.show();
//          A a = new A();
//          a.show();


    }

}
