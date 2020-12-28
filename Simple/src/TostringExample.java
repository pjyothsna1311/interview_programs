
public class TostringExample {
	
	int id;
	String name;
	
	TostringExample(int id,String name){
		
		this.id=id;
		this.name=name;
	}
	
	public String toString(){
		return name+""+id;
		
	}
	
	public static void main(String args[]){
		
		TostringExample te=new TostringExample(20,"jyo");
		System.out.println(te);
		
	}

}
