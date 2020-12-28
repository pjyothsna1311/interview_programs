
public class DefaultConstructor {
	
	int id;
	String name;
	public static void main(String args[]){
		
		DefaultConstructor d=new DefaultConstructor();
		System.out.println(d.id);
		System.out.println(d.name);
		
	}

}

//Here in the above example complier creates a default constructor as below and then intializies the object to its default values

/*
public class DefaultConstructor {
	
	int id;
	String name;
	
	DefaultConstructor(){
	
	
	}
	public static void main(String args[]){
		
		DefaultConstructor d=new DefaultConstructor();
		System.out.println(d.id);
		System.out.println(d.name);
		
	}

}

*/