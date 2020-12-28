package learning;

public class StaticVsInstance {

    static int a =10;
    int b = 20;
    void staticIncrement() {
        a++;
        System.out.println(a);
    }
    void instanceInc() {
        b++;
        System.out.println(b);
    }
    public static void main(String args[]) {

        StaticVsInstance staticVsInstance = new StaticVsInstance();
        staticVsInstance.staticIncrement();
        staticVsInstance.instanceInc();
        StaticVsInstance staticVsInstance1 = new StaticVsInstance();
        staticVsInstance1.staticIncrement();
        staticVsInstance1.instanceInc();

    }
}
