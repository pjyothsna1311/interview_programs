
public class Datatype {
	public static void main(String args[]){
	
		int a=10;
		float f=a; // widening
		System.out.println("int value is" +a );
		System.out.println("float value is" +f );
		float b=10.5f;
		int c=(int) f; //narrowing
		System.out.println("int value is" +c );
		System.out.println("float value is" +b );
		int d=130;  //overflow
		byte by=(byte) d;
		System.out.println("int value is" +d );
		System.out.println("byte value is" +by );
		
		
	}

}
