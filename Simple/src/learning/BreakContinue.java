package learning;

public class BreakContinue {
    public static void main(String args[]) {
        for(int i=0;i<10; i++) {
            if (i==5){
                break;
            }
            System.out.println(i);
        }

        for(int j=0;j<10; j++) {
            if (j==5){
                continue;
            }
            System.out.println(j);
        }
    }
}
