package learning;

public class StaticMethod {

    public static void main(String args[]) {
        StaticMethod staticMethod = new StaticMethod();
        display();
        staticMethod.show();
    }
    static void display() {
        System.out.print("static method");
    }
    void show() {
        System.out.print("show");
        display();
    }
}
