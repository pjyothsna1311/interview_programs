
public class StaticMethod {
	
	int age;
	String name;
	static String college="abc";
	static String dept="cse";
	
	StaticMethod(int a,String n){
		age=a;
		name=n;
	}
	
	static void change(){
		college="def";
	}
	void display(){
		System.out.println("age"+age+"name"+name+"college"+college);
	}
	
	public static void main(String args[]){
		
		StaticMethod.change(); //There is no need to create obj for accessing static method.
		change();  //can access like this also
		
		StaticMethod.dept="ece"; //No need to create obj for accessing static variable also
		
		StaticMethod s1=new StaticMethod(20,"jyo");
		s1.display();
		
		System.out.println(s1.age);
		
	}

}
