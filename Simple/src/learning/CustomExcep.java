package learning;

public class CustomExcep extends Exception {

    CustomExcep(String s){
        super(s);
    }
}

class CustomExcepDemo{

    public void validate(int age) throws CustomExcep {
        if(age<18) {
            throw new CustomExcep("not valid age");
        }
    }
    public static void main(String args[]) {
        CustomExcepDemo customExcepDemo = new CustomExcepDemo();
        try{
            customExcepDemo.validate(13);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
