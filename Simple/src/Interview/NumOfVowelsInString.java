package Interview;

import java.util.Scanner;

public class NumOfVowelsInString {
	public static void main(String[] args) {
		String s;
		int count=0;
		int count1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		s=sc.nextLine();
		char[] word=s.toCharArray();
		for(char c:word){
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			break;
			default: count1++;
			}
		}
		System.out.println(count+""+count1);
		
		
	}

}
