package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparatorDemo {

    public static void main(String args[]) {
        List<Jyothsna> comparable = new ArrayList<>();
        Jyothsna j1 = new Jyothsna(500,"jyo");
        Jyothsna j2 = new Jyothsna(200,"phani");
        comparable.add(j1);
        comparable.add(j2);
        Collections.sort(comparable);
        for(Jyothsna j:comparable){
            System.out.println(j.id);
        }



        List<Phani> comparator = new ArrayList<>();
        Phani p1 = new Phani(1000,"jyo");
        Phani p2 = new Phani(200,"phani");
        comparator.add(p1);
        comparator.add(p2);
        Collections.sort(comparator,new Phani(20,"sunny"));
        for(Phani j:comparator){
            System.out.println(j.id);
        }
    }
}

class Jyothsna implements Comparable<Jyothsna> {
    int id;
    String name;
    Jyothsna(int id,String name){
        this.id = id;
        this.name=name;
    }

    public int compareTo(Jyothsna j){
        if(id == j.id)
            return 0;
        else if(id>j.id)
            return 1;
        else
            return -1;
    }
}

class Phani implements Comparator<Phani> {
    int id;
    String name;
    Phani(int id,String name){
        this.id =id;
        this.name =name;
    }
    public int compare(Phani p1,Phani p2){
        if(p1.id == p2.id)
            return 0;
        else if(p1.id>p2.id)
            return 1;
        else
            return -1;
    }
}
