package Java8;

interface A1{

    public void print();

    //Default methods should always be implemented in interface.
    default void show() {
        System.out.println("I am from interface A1");
    }
    default void overrideDefaultMethodInClass() {
        System.out.println("I override method from interface");
    }

    default void multipleInheritanceTest() {
        System.out.println("I am inheritance from interface 1");
    }


}

interface A2 {
    default void multipleInheritanceTest() {
        System.out.println("I am inheritance from interface 2");
    }
}

public class DefaultMethodsInterface implements A1,A2 {
    @Override
    public void print() {
        System.out.println("I am printing from class DefaultMethodsInterface ");
    }

    public void overrideDefaultMethodInClass() {
        System.out.println("I override method from class");
    }
    public void multipleInheritanceTest() {
        System.out.println("Resolving multiple inheritance issue from class");
    }

    public static void main(String[] args) {
        A1 a = new DefaultMethodsInterface();
        a.print();
        a.show();

        a.overrideDefaultMethodInClass();

        //We will get compilation error if we implements two interfaces that have the same method.
        //To resolve that we need to override that method in class also
        a.multipleInheritanceTest();
    }
}
