package Interview;

public class MethodOverloadingNullError {

    public void nullError(Object obj) {
        System.out.println("calling obj method");
    }

    public void nullError(String str) {
        System.out.println("calling string");
    }

    //Since Integer and String are non-primitives they both can accept null values.
    //So we will get compile time error because of ambiguity to invoke which method.
    //But in case of Obj and String or Obj and Integer first either String / Integer gets printed.
    /*public void nullError(Integer i) {
        System.out.println("calling integer");
    }*/

    public static void main(String[] args) {
        MethodOverloadingNullError m = new MethodOverloadingNullError();
        m.nullError(null);
    }
}
