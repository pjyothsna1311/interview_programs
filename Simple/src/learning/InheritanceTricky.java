package learning;

public class InheritanceTricky {

    //Constructor cannot be final abstract static
    InheritanceTricky() {
    }

    public static void main(String args[]) {

        String s ="A";
        s.replace('A','a');
        System.out.println("Name is: " + s);

        String s1 = new String("A");
        s1.replace("A","b");
        System.out.println("Name is: " + s1);

        StringBuffer sb = new StringBuffer("C");
        sb.replace(0,1,"c");
        System.out.println(sb);



        Base obj = new Derives();

        int x,y,z;

        //Compilation error b/s within method variables should be initialized.
       // System.out.println(x+y+z);

        //String s1 = "A", s2 = "B";

        //Will throw compilation error
        //obj.getMethod();
    }
}

class Base {
    public void getMethod(int a) {

        System.out.println("Base");
    }
}

class Derives extends Base {
    public void getMethod() {
        System.out.println("Derived");
    }
}
