
public class WrapperClass {
	
	public static void main(String args[]){
		int a=20;
		
		//Converting primitive to Object
		Integer i=Integer.valueOf(a); //autoboxing
		float name=20f;
		Float f=Float.valueOf(name); 
		int j=i;
		System.out.println(i+""+j+""+f);
		
		//Converting Object to primitive
		Integer k=new Integer(20);
		int b=k.intValue();
		int c=b;
		System.out.println("k is"+k+"int is"+c+""+b);
	}

}
