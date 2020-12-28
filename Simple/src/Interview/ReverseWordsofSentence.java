package Interview;

public class ReverseWordsofSentence {
	public static void main(String[] args) {
		String s="Hi I am Jyothsna";
		char a[]=s.toCharArray();
		
		char temp;
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
		 {
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
		 a.toString();
		 System.out.println(a);

		 String s1 = "Hi This Is Jyothsna";
		 String s2[] = s1.split(" ", 4);
		 for(int m = s2.length-1;m>=0;m--){
			 System.out.println(s2[m]);
		 }


			
		}
	}


