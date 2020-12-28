package learning;

public class PassByValue {

    void SwapObjects(Integer i, Integer j) {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
        System.out.println("objs" + i + "  "+ j);
    }

    void swapVariables(int i, int j){
        int temp = i;
        i = j;
        j = temp;
        System.out.println("swap " + i + "  " + j);

    }

    public static void main(String[] args) {
        PassByValue passByValue = new PassByValue();
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        passByValue.SwapObjects(i,j);
        System.out.println("After swapping objs" + " " + i + " " + j);

        int x = 100, y = 200;
        passByValue.swapVariables(x,y);
        System.out.println("After swapping vars " + x + "  " + y);

    }
}
