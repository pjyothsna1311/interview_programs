package Interview;

public class Deadlock {

	public static void main(String[] args) {
		Deadlock d=new Deadlock();
		Thread1 t1=new Thread1("jyo");
		Thread2 t2=new Thread2("ravi");
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread
{
	String name;
	public Thread1(String name) {
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
class Thread2 extends Thread{
	
	String name;
	public Thread2(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (Object.class) {
			System.out.println(Thread.currentThread().getName()+"has acquired lock on obj class and waiting to acquire on string class");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (String.class) {
				System.out.println(Thread.currentThread().getName()+"has acquired lock on string class");
			}
		}
		System.out.println(Thread.currentThread().getName()+"has ended");
		
	}
	
}
