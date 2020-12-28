package Java8;

interface MethodRef{
    void methodref();
}

interface constRef{
    MethodReferences constref(String str);
}

public class MethodReferences {

    MethodReferences(String str){
        System.out.println(str);
    }


    public static void staticMethodRef () {
        System.out.println("I am static method reference");
    }

    public void instanceMethodRef() {
        System.out.println("I am instance method");
    }

    public void ThreadCreate(){
        System.out.println("Thread running");
    }

    public static void main(String[] args) {

        MethodReferences mr = new MethodReferences("jyo");
        //Refering static method
        MethodRef m = MethodReferences::staticMethodRef;
        m.methodref();

        MethodRef m1 = () -> System.out.println("static method ref using lambda");
        m1.methodref();

        //Reference instance method
        MethodRef mi = mr::instanceMethodRef;
        mi.methodref();

        //Creating Thread
        Thread t1 = new Thread(mr::ThreadCreate);
        t1.start();



    }
}
