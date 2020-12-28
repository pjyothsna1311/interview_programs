package Interview;

public class CountVowelsConsonants {
	
	public static void main(String[] args) {
		String s="jyothsna";
		int count1=0;
		int count2=0;
		char[] ch=s.toCharArray();
		for(char c:ch){
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count1++;
				default: count2++;
			}
		}
		System.out.println(count1+""+count2);
	}

}
