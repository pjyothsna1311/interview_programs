package Java8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class LambdaExpressions {

    public  void classMethod() {
        System.out.println("I am class method");
    }

    public static void main(String[] args) {
        LambdaExpressions l = new LambdaExpressions();
        Drawable d = () -> {
            System.out.println("drawing no parameters");
            l.classMethod();
        };
        d.draw();

        Shape s = (shape_name) -> {return shape_name;};
        System.out.println(s.shape("rectangle"));

        Add a = (x,y) -> {
            System.out.println("adding nums");
             return x+y;
        };
        System.out.println(a.add(20,30));


        Add add = (i,j) ->  i+j;
        System.out.println(add.add(100,200));

        //foreach loop in collections
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(500);
        list.forEach((n) -> System.out.println(n));


        //creating thread --  runnable interface will have only one method
        Runnable r1 = () -> {
            System.out.println("creating thread using lambda");

        };
        Thread t1 = new Thread(r1);
        t1.start();

        //Collections.sort();

    }
}

interface Drawable{
    void draw();

    default void show() {
        System.out.println("showing");
    }
}

interface Shape{
    String shape(String str);
}

interface Add {
    int add(int a, int b);
}
