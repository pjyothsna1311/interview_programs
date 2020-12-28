

// Same constructor name but with diff signatures
public class ConstructorOverloading {
	
	public static void main(String args[]){
		
		Student1 s1=new Student1(20,"phani");
		Student1 s2=new Student1(30,"jyo",25);
		s1.display();
		s2.display();
	}

}
