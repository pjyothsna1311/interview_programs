
public class LocalInnerClass {
	
	int data=100;
	
	void display(){
		System.out.println("outer class");
		class LocalInner{
			int data=20;
			
			String s="jyo";
			void show(){
				System.out.println(data);
			}
			
		}
		LocalInner l=new LocalInner();
		l.show();
	}
	
	public static void main(String[] args) {
		
		LocalInnerClass l1=new LocalInnerClass();
		l1.display();
	}

}
