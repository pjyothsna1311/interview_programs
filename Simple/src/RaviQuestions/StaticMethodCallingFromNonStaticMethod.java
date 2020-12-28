package RaviQuestions;

public class StaticMethodCallingFromNonStaticMethod {

    static void display() {
        System.out.print("static method");
    }

    void show(){
        display();
    }

    public static void main(String args[]) {
        StaticMethodCallingFromNonStaticMethod staticMethodCallingFromNonStaticMethod = new StaticMethodCallingFromNonStaticMethod();
        staticMethodCallingFromNonStaticMethod.show();
    }
}

