package NetCracker;

import java.util.*;

public class SquareOfUniqueNumInArray {

    public static void main(String[] args) {
        Integer a[] = {2,5,2,8,9,3,4,5,3};
        List<Integer> al = new ArrayList<Integer>(Arrays.asList(a));
        Set<Integer> set = new HashSet<>(al);
        for(Integer j : set) {
            System.out.println(j);
        }
        for(Integer i: set) {
            System.out.println("squares of unique numbers are" + i*i);
        }
    }
}
