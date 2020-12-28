package learning;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String args[]) {
        String str = "I am good girl";
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while(stringTokenizer.hasMoreTokens()) {
           System.out.println(stringTokenizer.nextToken());
        }
    }
}
