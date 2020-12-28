package Interview;

public class NumPalindrome {
    public static void main(String[] args) {
        int x = 101;
        int reverse = 0;
        int remainder;
        while(x>0){
            remainder = x%10;
             x = x/10;
             reverse = reverse*10+remainder;
        }

        System.out.println("reverse" + reverse);
        if(x == reverse) {
            System.out.println(reverse);
            System.out.println("palindrome");
        }
    }
}
