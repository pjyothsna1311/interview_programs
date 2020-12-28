package Interview;

public class ReplaceGivenCharToOther {
	
	public static void main(String[] args) {
		String s="java is good";
		char c='n';
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='j'){
				s=s.replace(s.charAt(i), c);
				
			}
		}
		System.out.println(s);
		
	}

}
