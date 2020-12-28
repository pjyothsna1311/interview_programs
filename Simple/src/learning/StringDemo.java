package learning;

public class StringDemo {

    public static void main(String args[]){
        String s1 ="jyo";
        String s2 = new String("jyo");
        String s3 = "jyo";
        String s4 = new String("jyo");
        System.out.println(s1.equals(s2)); //compares content
        System.out.println(s1==s2); // compares the ref, s1 points to string const pool whereas s2 refers to heap
        System.out.println(s1==s3);
        System.out.println(s2==s4);  // because with new keyword two new objs s2 and s4 gets created in heap
        System.out.println(s2.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s1.hashCode());

        //String concatenation
        String str = "jyo";
        System.out.println(str.hashCode());
        str = str+"ravi";
        System.out.println(str);
        System.out.println(str.hashCode());

        String str1 = new String(40+30+"string"+50+60);
        System.out.println(str1);


    }
}
