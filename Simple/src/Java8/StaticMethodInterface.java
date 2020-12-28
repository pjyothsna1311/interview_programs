package Java8;

interface static1{

    //static methods should have implementation in interface
    static void display() {
        System.out.println("static methods in interface");
    }

    static void overrideStaticMethod() {
        System.out.println("static override method in interface");
    }

    static void multipleInheritanceTest() {
        System.out.println("static 1 mul inheritance");
    }



}
interface static2 {
    static void multipleInheritanceTest() {
        System.out.println("static 1 mul inheritance");
    }
}

public class StaticMethodInterface implements static1, static2 {

    //static methods cannot be overriden.
    static void overrideStaticMethod() {
        System.out.println("static override method in class");
    }

    public static void main(String[] args) {

        //Static methods can be called only by using their interface name
        static1.display();

        StaticMethodInterface.overrideStaticMethod();



    }
}
