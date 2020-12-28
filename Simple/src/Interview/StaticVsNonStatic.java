package Interview;

public class StaticVsNonStatic {
	
	static int a=20;
	int b=30;
	
	public void nonStaticMethod(){
		System.out.println("non static");
		System.out.println(a+" "+b); //accessing static and non static var from non static method
	}
	
	public static void main(String[] args) {
		StaticVsNonStatic s=new StaticVsNonStatic();
		System.out.println("main method static");
		System.out.println(a);
		System.out.println(s.b); //legal
		//System.out.println(b); illegal b/s we can't access non static var from static method. Use obj.var to access it
	}
	
	public static  void staticMethod(){
		System.out.println("static mrthod");
		
	}

}
