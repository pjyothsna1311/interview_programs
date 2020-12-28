class Multiply{
	
	//If there is no synchronization output is not consistent every time. This is synchronizzed method
	synchronized void printTable(int n){
		for(int i=1;i<5;i++)
			System.out.println(n*i);
		try{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	void Add(int n){
		
		//Synchronized block
		synchronized (this) {
			for(int i=1;i<5;i++){
				System.out.println(n+i);
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					System.out.println(e);
				}
			}
		}
		
	}
	
}

class MyThread1 extends Thread{
	Multiply m;
	public MyThread1(Multiply m) {
		// TODO Auto-generated constructor stub
		this.m=m;
	}
	public void run(){
		m.printTable(100);
	}
	
}

class MyThread2 extends Thread{
	Multiply m;
	public MyThread2(Multiply m) {
		// TODO Auto-generated constructor stub
		this.m=m;
	}
	public void run(){
		m.printTable(20);
	}
}

class MyThread3 extends Thread{
	Multiply m;
	public MyThread3(Multiply m) {
		// TODO Auto-generated constructor stub
		this.m=m;
	}
	public void run(){
		m.printTable(5);
	}
}
public class Synchronization_Dmeo {
	
	public static void main(String[] args) {
		
		final Multiply m=new Multiply();
		MyThread1 my1=new MyThread1(m);
		MyThread2 my2=new MyThread2(m);
		MyThread3 my3=new MyThread3(m);
		my1.start();
		my2.start();
		my3.start();
		
		//Using Anonymous class
		Thread t1=new Thread(){
			
			public void run(){
				m.printTable(2);
			}
			
		};
		t1.start();
		
		Thread t2=new Thread(){
			
			public void run(){
				m.Add(12);
			}
		};
		t2.start();
		
	}

}
