
public class CallParameterConstFrmDefault {
	
	int id;
	String name;
	
	CallParameterConstFrmDefault(){
		
		this(20,"jyo");  //calling parameterized const frm default constructor
		System.out.println("hi");
		
	}
	
	CallParameterConstFrmDefault(int id,String name){
		
		this.id=id;  //referring current class variable
		this.name=name;
		
	}
	
	void display(){
		System.out.println(id+""+name);
	}
	
	
	
	public static void main(String args[]){
		
		CallParameterConstFrmDefault c=new CallParameterConstFrmDefault();
		c.display();
		
	}

}
