package learning;

public class BlankFinalVar {

    final int x;

    static final int y;
    static {
        y=200;
    }

    public BlankFinalVar(int x) {
        this.x = x;
    }


    public static void main(String args[]) {
        BlankFinalVar blankFinalVar = new BlankFinalVar(10);
        System.out.println(blankFinalVar.x);
        BlankFinalVar blankFinalVar1 = new BlankFinalVar(100);
        System.out.println(blankFinalVar1.x);
        System.out.println(y);

    }
}
