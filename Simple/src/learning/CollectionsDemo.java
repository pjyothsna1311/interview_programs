package learning;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        CityAdr cityAdr = new CityAdr(123,"bantumilli road");
        Family f1 = new Family(29,"jyo",cityAdr);
        Family f2 = new Family(29,"jyo",cityAdr);
        List<Family> list = new ArrayList<>();
        list.add(f1);
        list.add(f2);
        System.out.println("List demo");
        for(Family f: list){
            System.out.println(f.age+ "  "+ f.name+ "  "+ f.cityAdr.street+ "   "+ f.cityAdr.pincode);
        }

        Iterator<Family> iterator = list.iterator();
        while(iterator.hasNext()){
            Family f = iterator.next();
            System.out.println(f.age+ "  "+ f.name+ "  "+ f.cityAdr.street+ "   "+ f.cityAdr.pincode);
        }


        //set doesn't allows dup elements. But it can take dup objects. To overcome that we have to explicitly override equals and hashcode for custom objs
        Set<Family> set = new HashSet<>();
        set.add(f1);
        set.add(f2);

        System.out.println("Set demo");
        for(Family f: set){
            System.out.println(f.age+ "  "+ f.name+ "  "+ f.cityAdr.street+ "   "+ f.cityAdr.pincode);
        }

        Iterator<Family> i = set.iterator();
        while(i.hasNext()){
            Family f = i.next();
            System.out.println(f.age+ "  "+ f.name+ "  "+ f.cityAdr.street+ "   "+ f.cityAdr.pincode);
        }


        System.out.println("Map demo");
        Map<Integer,Family> map = new HashMap<>();
        map.put(1,f1);
        map.put(2,f2);

        for(Map.Entry<Integer,Family> m: map.entrySet()){
            Family f = m.getValue();
            System.out.println(m.getKey()+ "  " + f.age+ "  "+ f.name+ "  "+ f.cityAdr.street+ "   "+ f.cityAdr.pincode);
        }

        Iterator<Map.Entry<Integer,Family>> mapIterator = map.entrySet().iterator();
        while(mapIterator.hasNext()) {

            Map.Entry entry = mapIterator.next();
            Integer j = (Integer)entry.getKey();
            Family f = (Family)entry.getValue();
            System.out.println( j +"  "+f.age+ "  "+ f.name+ "  "+ f.cityAdr.street+ "   "+ f.cityAdr.pincode);
        }

        System.out.println("Iterating key set");
        for(Integer integer: map.keySet()){
            System.out.println(integer);
        }

        System.out.println("Iterating value set");
        for(Family f: map.values()){
            System.out.println(f.age+ "  "+ f.name+ "  "+ f.cityAdr.street+ "   "+ f.cityAdr.pincode);
        }





    }
}

class Family{
    int age;
    String name;
    CityAdr cityAdr;
    Family(int age, String name,CityAdr cityAdr){
        this.age= age;
        this.name = name;
        this.cityAdr = cityAdr;
    }

}

class CityAdr{

    int pincode;
    String street;

    CityAdr(int pincode,String street){
        this.pincode = pincode;
        this.street = street;
    }
}
