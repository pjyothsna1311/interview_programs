package learning;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Variables {

    int instancevar = 100;
    static int staticvar = 200;
    public static void main(String args[]) {
        Variables variables = new Variables();
        //can access non-static fields only by uisng object inside the static method
        System.out.println(variables.instancevar);
        variables.localvariable();
        System.out.println(staticvar);
        variables.local();
    }
    void localvariable(){

        //local variable
        int a = 50;
        System.out.println("local var" + a);
        System.out.println(instancevar);
        System.out.println(staticvar);
    }

    void local() {

        //can access non-static inside non-staic method without obj
        localvariable();
    }


}
