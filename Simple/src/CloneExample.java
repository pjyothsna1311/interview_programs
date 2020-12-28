
public class CloneExample implements Cloneable {
	
	int id;
	String name;
	CloneExample(int id, String name){
		this.id=id;
		this.name=name;
	}
	CloneExample(){
		
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	public static void main(String args[]){
		
		
		try {
			CloneExample c1=new CloneExample(20,"jyo");
			CloneExample copy= (CloneExample)c1.clone();
			CloneExample c3=new CloneExample();
			CloneExample cpoy1=(CloneExample)c3.clone();
			System.out.println(c1.id+""+copy.name);
			System.out.println(c1.equals(copy));
			System.out.println(c3.equals(cpoy1));
			System.out.println(c3.id==cpoy1.id);
			System.out.println(c1.hashCode()+""+copy.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
