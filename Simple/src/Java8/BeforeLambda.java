package Java8;

public class BeforeLambda implements  Before{
    @Override
    public void display() {
        System.out.println("display");
        show();
    }

    public static void main(String[] args) {
        Before before = new BeforeLambda();
        before.display();
    }
}

interface Before {
    void display();
    default void show() {
        System.out.println("showing");
    }
}
