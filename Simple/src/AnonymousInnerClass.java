abstract class Jyothsna{
	abstract void show();
}
public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		Jyothsna j=new Jyothsna(){
			void show(){
				System.out.println("I am Jyothsna");
			}
		};
		Phani p=new Phani(){
			public void display(){
				System.out.println("I am phani");
			}
		};
		j.show();
		p.display();
	}

}

interface Phani{
	void display();
}
