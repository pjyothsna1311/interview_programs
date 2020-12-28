
/* This program ensures that all the threads are executed in the order in which they are defined */
package Interview;

public class Thread_Join extends Thread {
	String name;
	Thread_Join(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<5;i++){
		System.out.println("thread running"+"  "+name);
		}
		System.out.println("completed running"+name);
	}
	public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread().getName());
		Thread_Join t1=new Thread_Join("jyothsna");
		Thread_Join t2=new Thread_Join("ravi");
		try{
			t1.start();
			t1.join();
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			t2.start();
			t2.join();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
