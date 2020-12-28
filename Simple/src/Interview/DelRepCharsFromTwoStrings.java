package Interview;

import java.util.Scanner;

public class DelRepCharsFromTwoStrings {
	public static void main(String[] args) {
		String s1,s2;
		System.out.println("enter two strings");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<s1.length();i++){
			boolean match=false;
			for(int j=0;j<s2.length();j++){
				if ((String.valueOf(c1[i])).toLowerCase().equals(
                        ((String.valueOf(c2[j])).toLowerCase()))){
					match=true;
					
				}
				if(match){
					s1=s1.replaceAll(String.valueOf(c1[i]), "");
					//s1=s1.replaceAll(String.valueOf(c1[i]).toLowerCase(), "");
					s2=s2.replaceAll(String.valueOf(c2[j]), "");
					//s2=s2.replaceAll(String.valueOf(c1[i]).toLowerCase(), "");
					
				}
			}
			
		}
		System.out.println(s1+ "" + s2);
		
	}

}
