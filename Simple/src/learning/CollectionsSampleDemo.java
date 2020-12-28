package learning;

import java.util.*;
import java.util.stream.StreamSupport;

public class CollectionsSampleDemo {

    public static void main(String args[]) {
        List<String> linkedlist = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(20); // can have dup ele also and it maintains insertion order
        arrayList.add(null);
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next());
        }

        for(Integer integer: arrayList) {
            System.out.print(integer);
        }


        List<Students> studentlist = new ArrayList<>();
        Students s1 = new Students(10,"jyo");
        Students s2 = new Students(10,"jyo");
        studentlist.add(s1);
        studentlist.add(s2);
        Iterator i = studentlist.iterator();
        while(i.hasNext()) {
            Students st=(Students)i.next(); //casting itr.next to Students object
            System.out.println(st.name);
        }
        for(Students s:studentlist){
            System.out.println(s.name);
        }

        Set<Students> hashset = new HashSet<>();
        hashset.add(s1); //it can store dup objects but not dup integers or strings etc
        hashset.add(s2);
        for(Students s: hashset) {
            System.out.println(s.no);
        }

        Map<Integer,String> map= new HashMap<>();
        map.put(1,"jyo");
        map.put(2,"ravi");
        map.put(2,"phani");  //only unique elements
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }

        Map<Integer,Students> mstudents = new HashMap<>();
        mstudents.put(1,s1);
        mstudents.put(2,s2); //dup is not applicable for objs
        for(Map.Entry m: mstudents.entrySet()){
            Students s = (Students)m.getValue();
            System.out.println(m.getKey() + "" + s.name);
        }


    }
}

class Students {
    int no;
    String name;
    Students(int no,String name) {
        this.no = no;
        this.name = name;
    }

}
