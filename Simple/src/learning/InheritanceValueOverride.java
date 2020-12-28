package learning;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class InheritanceValueOverride {

    public static void main(String args[]) {

        AA aa = new BB();
        System.out.println(aa.x);

    }
}

class AA{
    int x = 10;

    public void A() {
        System.out.println("A");
    }
}

class BB extends  AA {
    int x = 100;
    public void B() {
        System.out.println("B");
    }

}
