package Java8;

interface StringFormatter{
    String format(String string1, String string2);
}

public class FunctionalInterface {

    public static void main(String[] args) {

        StringFormatter s = (s1,s2) -> {return s1 + " " + s2;};
        StringFormatter s2 = (s3,s4) -> {return s3 + "-" + s4;};
        StringFormatter s3 = (s5,s6) -> {return s5 + " " + s6;};
        System.out.println(s.format("Lambda","Expression"));
        System.out.println(s2.format("Lambda","Expression"));
        System.out.println(s3.format("LAMBDA","EXPRESSION"));

    }
}
