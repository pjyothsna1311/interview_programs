import java.util.HashMap;
import java.util.Map;

public class Test12 {

    public static void main(String[] args) {
        String s = "jyothsnaaa";
        char[] c = s.toCharArray();
        HashMap<Character,Integer> count = new HashMap<>();
        for(char ch: c) {
            if(count.containsKey(ch)) {
                count.put(ch,count.get(ch) + 1);
            }
            else {
                count.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> map : count.entrySet()) {
            System.out.println("character " + map.getKey() + "times" + map.getValue());
        }
    }
}
