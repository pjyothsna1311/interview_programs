
public class CopyObjvaluesIntoAnotherObj {
	
	int age;
	String name;
	
	CopyObjvaluesIntoAnotherObj(int i,String n){
		age=i;
		name=n;
	}
	
	
	//Copying through construcor
	CopyObjvaluesIntoAnotherObj(CopyObjvaluesIntoAnotherObj c){
		age=c.age;
		name=c.name;
	} 
	
	//Copying by assigning values of one obj to another
	CopyObjvaluesIntoAnotherObj(){
		
	}
	
	void display(){
		System.out.println(age+""+name);
	}
	
	public static void main(String args[]){
		
		CopyObjvaluesIntoAnotherObj c1=new CopyObjvaluesIntoAnotherObj(20,"jyo");
		
		//Copying through construcor
		CopyObjvaluesIntoAnotherObj c2=new CopyObjvaluesIntoAnotherObj(c1);
		
		//Copying by assigning values of one obj to another
		CopyObjvaluesIntoAnotherObj c3=new CopyObjvaluesIntoAnotherObj();
		
		c3.age=c1.age;
		c3.name=c1.name;
		
				
		
		c1.display();
		c2.display();
		c3.display();
		
		
	}

}
