package learning;

public class VarArgsDemo {

    public void varargs(String str, int i, int ... a){
        System.out.println("normal parameters" + str + "  " + i);
        System.out.println("var args parameters");
        for(int j: a) {
            System.out.println(j);
        }
    }

}

class TestVarArgs {
    public static void main(String[] args) {
        VarArgsDemo varArgsDemo = new VarArgsDemo();
        varArgsDemo.varargs("jyo",1,10,20,30);
        varArgsDemo.varargs("jyo",1,100);
    }
}
