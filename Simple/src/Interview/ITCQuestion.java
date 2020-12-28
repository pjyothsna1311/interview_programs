package Interview;

public class ITCQuestion {
	
	public static void main(String[] args) {
		String s="aabb aacc aadd";
		String[] s1=s.split(" ", 3);
		int count1=0,count2=0,count3=0,count4=0;
		
		for(String a:s1){
			System.out.println(a);
			if(a.contains("aa"))
				count1++;
			if(a.contains("bb"))
				count2++;
			if(a.contains("cc"))
				count3++;
			if(a.contains("dd"))
				count4++;
				
		}
		System.out.println(count1+""+count2+""+count3+""+count4);
		
	}

}
