package learning;

public class ExceptionInCatchBlock {

    public static void main(String args[]) {
        try{
            int i = 50/0;
        }
        catch (ArithmeticException e){
            try {
                int j = 50 / 0;
            }
            catch (Exception e1){
                System.out.println("exception caught in another catch block");
            }
            System.out.println("exception in catch");
        }
    }
}
