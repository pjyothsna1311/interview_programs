
public class StringExample {
	
	public static void main(String args[]){
		
		
		//Using String literals
		String s="jyo";
		String s1="jyo";   //Will not create a new obj but will return the same obj reference
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		
		//Using new keyword
		String a=new String("phani");
		String a1=new String("phani");
		a.concat("sunny");
		System.out.println(a);
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a.equals(a1));
		
		//immutable strings
		String im="papai";     // create an obj with value papai and ref im
		System.out.println(im.hashCode());
		im.concat("jyo");
		System.out.println(im);   // will print papai only 
		System.out.println(im.hashCode());
		im=im.concat("pranu");     //creates another obj with value papaipranu but the old obj papai still exists. But im points to papaipranu
		System.out.println(im.hashCode());
		System.out.println(im);
		String im1=im.concat("pranu");  //creates another obj with value papaipranupranu
		System.out.println(im1);
		String j="";
		System.out.println(j);
		
		
		//String Comparision   == compares based on reference equals method compares based on content.
		String sc="hello";
		String sc2="hello";
		String sc1=new String("hello");
		String sc4=new String("hello");
		String sc3="world";
		System.out.println(sc.hashCode());
		System.out.println(sc1.hashCode());
		System.out.println(sc==sc1);   // returns false because sc points to obj in String constant pool whereas sc1 points to obj in Heap memory.
		System.out.println(sc==sc2);   // returns true because both sc and sc2 points to the same obj in string constant pool
		System.out.println(sc1==sc4);  // returns false bacause two objs are created in heap memory area
		System.out.println(sc.equals(sc2)+""+sc.equals(sc1)+""+sc1.equals(sc4));
		System.out.println(sc.compareTo(sc1));
		System.out.println(sc3.compareTo(sc));
		
		//String Concatenation
		String c=30+40+"Jyothsna"+"padamata"+40+60;
		System.out.println(c);
		c=c.concat("40");
		System.out.println(c);
		
		//Substring
		String ss="Jyothsna Padamata";
		System.out.println(ss.substring(6));
		System.out.println(ss.substring(0,5));
		
		
		
	}

}
