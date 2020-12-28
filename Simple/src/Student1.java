
public class Student1 {
	
	int id;
	String name;
	int age;
	Student1(int i,String s){
		id=i;
		name=s;
	}
	Student1(int i, String s, int a){
		
		id=i;
		name=s;
		age=a;
		
	}
	void display(){
		System.out.println(id+""+name+""+age);
	}

}
