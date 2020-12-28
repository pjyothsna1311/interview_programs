package Interview;

// A class can't extend from mul abs classes because mul inheritance is not supported by java.
public class InheritFromMulAbsClass extends Abs1{

    public void show() {
        System.out.println("implemented");
    }

    public static void main(String[] args) {
        InheritFromMulAbsClass i = new InheritFromMulAbsClass();
        i.show();
    }
}

abstract class Abs1 {

    abstract void show();
}
abstract class Abs2 {
    abstract void show();
}
