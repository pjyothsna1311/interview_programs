
public class CallByValue {
	
	int data=500;
	
	void change(CallByValue c ){
		c.data=c.data+100;
		
	}
	public static void main(String args[]){
		
		CallByValue cv=new CallByValue();
		System.out.println("before changes"+cv.data);
		cv.change(cv);
		System.out.println("after changes"+cv.data);
		cv.change(cv);
		System.out.println("after changes"+cv.data);
	}

}
