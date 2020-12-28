package learning;

public class Test {
    public static void main(String args[]){
        System.out.println("tested");
        SaveFileWithOtherName saveFileWithOtherName = new SaveFileWithOtherName();
        saveFileWithOtherName.printsomething();
    }
}

class SaveFileWithOtherName {

    void printsomething() {
        System.out.println("we can save a java source file with name other than the class name if that class is not public");
    }


}
