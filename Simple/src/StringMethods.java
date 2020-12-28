
public class StringMethods {
	
	public static void main(String args[]){
		
		String s="jyothsna is a good girl";
		String s1=new String("phani is a good boy");
		String s2="";
		System.out.println(s.charAt(9));
		//System.out.println(s.charAt(98));  throws out of index exception
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s.concat("hello"));
		System.out.println(s.contains("good"));
		//System.out.println(s.contains(null)); throws null pointer exception
		//System.out.println(s.endsWith(null)); throws null pointer exception
		System.out.println(s.endsWith("boy"));
		System.out.println(s.equals(s2));
	}

}
