package RaviQuestions;

public class MultipleInheritanceJava8 implements a,b{

    public static void main(String args[]) {
        MultipleInheritanceJava8 multipleInheritanceJava8 = new MultipleInheritanceJava8();
        multipleInheritanceJava8.show();

    }


    @Override
    public void show() {
        System.out.println("main show");
    }
}

interface a {
    default void show(){
        System.out.println("A show");
    }
}

interface b{
    default void show(){
        System.out.println("B show");
    }
}
