class Subtract{
	synchronized static void sub(int n){
		for(int i=1;i<5;i++){
			System.out.println(n-i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

public class StaticSynchronization_Demo {

	public static void main(String[] args) {
		
		//final Subtract s=new Subtract();
		Thread t1=new Thread(){
			public void run(){
				Subtract.sub(10);
			}
		};
		Thread t2=new Thread(){
			public void run(){
				Subtract.sub(20);
			}
		};
		Thread t3=new Thread(){
			public void run(){
				Subtract.sub(30);
			}
		};
		Thread t4=new Thread(){
			public void run(){
				Subtract.sub(40);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
