
class GetterSetter{
	
	private int id;
	private String name;
	
	void setId(int id){
		this.id=id;
	}
	
	void setName(String name){
		this.name=name;
	}
	
	int getId(){
		return id;
	}
	String getName(){
		return name;
	}
	
}

public class Encapsulation {

	public static void main(String args[]){
		
		GetterSetter gs=new GetterSetter();
		GetterSetter gs1=new GetterSetter();
		gs.setId(20);
		gs.setName("jyo");
		System.out.println(gs.getId()+gs.getName());
		System.out.println(gs.getClass());
		System.out.println(gs.toString());
	
		
	}
}
