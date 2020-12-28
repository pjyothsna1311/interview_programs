class Address{
	
	String city;
	int doorno;
	String state="AP";
	void sum(){
		int a=10;
		int result=a+30;
		System.out.println(result);
	}
	Address(String city,int doorno){
		this();
		this.city=city;
		this.doorno=doorno;
		
	}
	Address(){
		System.out.println("Default constructor");
	}
	
}

class Emp extends Address{
	
	int empid;
	String empname;
	float sal;
	String state="TN";
	Emp(int empid,String empname,float sal){
		
		
		super("mtm",96);  //referring immediate parent class constructor using super. In this case we are calling parameterized const of parent class. 	
		this.empid=empid;
		this.empname=empname;
		this.sal=sal;
		System.out.println(empid+""+empname+""+sal+city+""+doorno);
		System.out.println(state);
		System.out.println(super.state); // refering parent class variable using super
		super.sum();         // refering parent class method using super
		
	}
	
	
	
}


public class SuperExample {
	
	public static void main(String args[]){
		
		Emp e=new Emp(20,"jyo",2000f);
		
		//Address a=new Address("mtm",96);
		
		
		
		
		
	}

}
