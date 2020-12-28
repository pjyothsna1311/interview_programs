package learning;

import java.util.*;

public class HashMapSorting {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"jyo");
        hm.put(100,"ravi");
        //Set<Map.Entry<Integer,StringDemo>>
       // ArrayList<Integer> al = Map.E
    }
}

class HashMapKeySort implements Comparator<Map.Entry<Integer,String>> {

    @Override
    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return o1.getKey() - o2.getKey();
    }
}
