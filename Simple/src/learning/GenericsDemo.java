package learning;

import java.util.ArrayList;
import java.util.List;

//Generic class -- which can accept any type
public class GenericsDemo<T> {


    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get() {
        return obj;
    }

    <E> void genericMethod(E element){
        System.out.println(element);
    }
}

class TestGenerics{
    public static void main(String args[]){

        GenericsDemo<Integer> g = new GenericsDemo<>();
        g.add(10);
        GenericsDemo<String> g1 = new GenericsDemo<>();
        g1.add("Jyo");
        System.out.println(g.get()+ "    " + g1.get());
        g1.genericMethod(100);
        g.genericMethod("phani");

    }
}
