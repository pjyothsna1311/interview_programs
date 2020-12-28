package Interview;

public class SolToDeadlock {
	public static void main(String[] args) {
		Thread3 t1=new Thread3("jyo");
		Thread4 t2=new Thread4("ravi");
		t1.start();
		t2.start();
		
	}

}
class Thread3 extends Thread
{
	String name;
	public Thread3(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (String.class) {
			System.out.println(Thread.currentThread().getName()+"has accquired lock on String.class and waiting to acquire lock on Obj class");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (Object.class) {
				System.out.println(Thread.currentThread().getName()+"has acquired lock on obj class");
				
			}
			
			
		}
		System.out.println(Thread.currentThread().getName()+"has ended");
	}
	
}
class Thread4 extends Thread{
	
	String name;
	public Thread4(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (String.class) {
			System.out.println(Thread.currentThread().getName()+"has acquired lock on String class and waiting to acquire on obj class");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (Object.class) {
				System.out.println(Thread.currentThread().getName()+"has acquired lock on obj class");
			}
		}
		System.out.println(Thread.currentThread().getName()+"has ended");
		
	}
	
}

