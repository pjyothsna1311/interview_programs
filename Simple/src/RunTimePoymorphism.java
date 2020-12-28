
public class RunTimePoymorphism {

	public static void main(String args[]){
		
		Bank b;
		b=new SBI();
		System.out.println("sbi"+b.intrst());
		b=new ICICI();
		
		
	}
}
