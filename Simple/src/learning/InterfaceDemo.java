package learning;

public interface InterfaceDemo {

    //by default the methods in interface are abstract
    void display();
    abstract void show();
    default void withImplementation() {
        System.out.println("Java 8 new feature with implementation in interface itself");
    }

    static void staticMethod(){
        System.out.println("Java 8 new feature with implementation in interface itself -- static");
    }

    //final void show(); illegal becase final abstract void show() is not possible

}

interface MultipleInheritance {
    void display();
}

class Interface implements  InterfaceDemo {
    public static void main(String args[]) {

        InterfaceDemo interfaceDemo = new Interface();
        InterfaceDemo mulInheritance = new MulInheritance();
        interfaceDemo.display();
        interfaceDemo.show();
        interfaceDemo.withImplementation();
        InterfaceDemo.staticMethod();
        mulInheritance.display();

    }

    @Override
    public void display() {
        System.out.println("overriding interface methods");
    }

    @Override
    public void show() {
        System.out.println("overriding show interface methods");
    }

    /*@Override
    public void withImplementation() {
        System.out.println("overriding default Java 8 method interface methods");
    }*/
}

class MulInheritance implements InterfaceDemo, MultipleInheritance {

    @Override
    public void display() {
        System.out.println("achieving mul inheritance");
    }

    @Override
    public void show() {

    }
}
