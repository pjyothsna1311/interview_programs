package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee1 {
    int age;
    double salary;
    Employee1(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee1> emplist = new ArrayList<>();
        Employee1 e1 = new Employee1(30,900);
        Employee1 e2 = new Employee1(13,1000);
        Employee1 e3 = new Employee1(30,500);
        Employee1 e4 = new Employee1(35,200);
        emplist.add(e1);
        emplist.add(e2);
        emplist.add(e3);
        emplist.add(e4);

        //Using Java 8
        emplist.sort((s1,s2) -> {
            if(s1.age == s2.age) {
                return (int) (s1.salary - s2.salary);
            }
            return s1.age - s2.age;
        });

        //Collections.sort(emplist,new SortByAge());

        //e2,e3,e1,e4
        for(Employee1 e : emplist) {
            System.out.println(e.age + " " + e.salary);
        }


    }
}

class SortByAge implements Comparator<Employee1> {
    SortBySalary s = new SortBySalary();
    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        if(o1.age == o2.age){
            return (int) (o1.salary - o2.salary);
        }
        return o1.age - o2.age;
    }
}

class SortBySalary implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        return (int) (o1.salary - o2.salary);
    }
}
