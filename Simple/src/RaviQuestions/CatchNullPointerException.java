package RaviQuestions;

public class CatchNullPointerException {

    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("null pointer exception");
        }
    }
}
