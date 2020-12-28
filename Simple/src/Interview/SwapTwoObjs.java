package Interview;

public class SwapTwoObjs {

	public SwapTwoObjs() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car(20,"suzuki");
		Car c2=new Car(30,"maruti");
		Swap(c1,c2);
		c1.print();
		c2.print();

	}
	public static void Swap(Car c1,Car c2){
		 Car temp=c1;
		 c1=c2;
		 c2=temp;
	}

}

class Car{
	int modelNum;
	String name;
	public Car(int modelNum,String name) {
		// TODO Auto-generated constructor stub
		this.modelNum=modelNum;
		this.name=name;
	}
	public void print(){
		System.out.println(modelNum+" "+name);
	}
	
}
