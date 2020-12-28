package learning;

public class Inheritance {

    public static void main(String args[]) {
        B b= new B();
        b.display();
    }
}

class A {
void display() {
    System.out.println("A display");
}
}

class B extends  A {
    void show() {
        System.out.println("B show");
    }

    //overriding
    void display() {
        System.out.println("b display");
    }
}
