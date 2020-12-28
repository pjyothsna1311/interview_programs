package NetCracker;

import java.util.ArrayList;

public class StreamsQuestions {

    public static void main(String[] args) {
        Person p1 = new Person(29,"jyothsna","bangalore");
        Person p2 = new Person(30,"ravi","bangalore");
        Person p3 = new Person(24,"papai","hyderabad");
        Person p4 = new Person(2,"phani","hyderabad");
        Person p5 = new Person(5,"sunny","hyderabad");
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(p1);
        personArrayList.add(p2);
        personArrayList.add(p3);
        personArrayList.add(p4);
        personArrayList.add(p5);

        long count = personArrayList.stream().filter(p -> p.age >20 && p.age <=30 && p.city == "bangalore").count();
        System.out.println(count);
    }
}

class Person{
    int age;
    String name;
    String city;

    public Person(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

}
