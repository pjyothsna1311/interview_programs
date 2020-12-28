package learning;

public class MyCustomException extends Exception {

    String message = "found custom exception";

    MyCustomException(){
        super("age less than 20");
    }

    public static void main(String args[]) throws MyCustomException {
        Age age = new Age();
        try {
            age.checkAge(18);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}

class Age {
    int age = 20;
    void checkAge(int age) throws MyCustomException{
        if(age < 20) {
            throw new MyCustomException();
        }
    }
}
