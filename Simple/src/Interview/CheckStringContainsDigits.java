package Interview;

public class CheckStringContainsDigits {
	
	public static void main(String[] args) {
		
		String s="1234";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			Character c1=c[i];
			if(c1.isDigit(c[i]))
				System.out.println("yes");
			
		}
		
	}

}
