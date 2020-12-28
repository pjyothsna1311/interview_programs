package RaviQuestions;

public class AnotherStaticClass {

    public static void main(String args[]){
        StaticMethodCallingFromNonStaticMethod staticMethodCallingFromNonStaticMethod = new StaticMethodCallingFromNonStaticMethod();
        staticMethodCallingFromNonStaticMethod.show();
    }
}
