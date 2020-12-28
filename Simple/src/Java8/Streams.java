package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<Integer> intlist = new ArrayList<>();
        intlist.add(100);
        intlist.add(200);
        intlist.add(10);

        //filter method
        intlist.stream().filter(p -> p==100).forEach(System.out::println);

        //Map method
        List<Integer> addlist = intlist.stream().map(x -> x+2).collect(Collectors.toList());
        addlist.forEach(x -> System.out.println(x));

        //Map method with String
        List<String> stringlist = new ArrayList<>();
        stringlist.add("phani");
        stringlist.add("jyothsna");
        stringlist.stream().map(String::toUpperCase).forEach(x-> System.out.println(x));
        stringlist.stream().filter(x -> x.startsWith("j")).map(String::length).forEach(System.out::println);

        //sorted method
        stringlist.stream().sorted().forEach(System.out::println);


    }
}
