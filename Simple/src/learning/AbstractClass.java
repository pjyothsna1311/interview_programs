package learning;

public abstract class AbstractClass {

    //Abs class can have constructor
    AbstractClass(){
        System.out.println("Abs const");
        display();
        show();
    }
    public static void main(String args[]){

        AbstractClass abstractClass = new Jyo();

        //We cant create obj for abstract class
        //AbstractClass abstractClass1 = new AbstractClass();
        abstractClass.display();
        abstractClass.absFinalMethod();
        abstractClass.show();
    }
    abstract void display();
    void show() {
        System.out.println("show");
    }

    final void absFinalMethod(){
        System.out.println("final method in abs class");
    }
}

class Jyo extends AbstractClass{


    Jyo() {
        show();
        System.out.println("jyo const");
    }
    @Override
    void display() {
        System.out.println("display");
    }
    void show() {
        System.out.println(" jyo show");
    }

}
