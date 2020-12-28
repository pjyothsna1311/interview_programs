package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTraverse {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int age;
    String name;

    CollectionTraverse (int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        List<CollectionTraverse> l1 = new ArrayList<>();
        l1.add(new CollectionTraverse(20,"ravi"));
        l1.add(new CollectionTraverse(26,"jyo"));

        //printing array list
        for(CollectionTraverse c :l1){
            System.out.println("Traversing normally"+ c.age + "  " + c.name);
        }

        l1.forEach((n) -> {
            System.out.println("using lambda" + n.age + "  " + n.name);
            if (n.age == 26) {
                n.age  = n.age + 2;
            }
            System.out.println("using lambda" + n.age + "  " + n.name);
        });

        //Sorting collections
        l1.sort(Comparator.comparing(CollectionTraverse::getName));

        l1.forEach((n) -> System.out.println("After sorting" + n.age + "  " + n.name));

        l1.sort((str1,str2) -> str1.getAge() - str2.getAge());

        l1.forEach((n) -> System.out.println("After sorting" + n.age + "  " + n.name));




    }

}
