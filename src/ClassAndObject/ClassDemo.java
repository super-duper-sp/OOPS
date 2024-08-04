package ClassAndObject;

 class Animal {

    String name;

    Animal (String x){
        this.name=x;
    }

    void sound() {
        System.out.println("sounding");
    }
}

public class ClassDemo {
    public static void main(String[] args) {

        Animal dog = new Animal("xyz");
        String x= dog.name;
        System.out.println(x);
        dog.sound();

    }
}

