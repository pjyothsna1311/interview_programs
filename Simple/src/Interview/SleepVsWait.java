
/* Sleep can be called from inside and outside synchronized block. Wait only from Synchronization
 * No lock is required for sleep. Lock required for wait
 * Sleep is in Thread class. Wait is in obj class
 * Sleep when called from Synchronized block doesn't leave the lock, whereas wait wil release the lock and another thread will 
 * execute until the waiting thread is notified by Notify method*/
package Interview;

public class SleepVsWait extends Thread {
	int num;
	 void printTable(int num){
		synchronized (this) {
			for(int i=1;i<5;i++){
				System.out.println(i+num);
				try{
					System.out.println("executing"+Thread.currentThread().getName());
					wait(10000);
					System.out.println("wait completed for"+Thread.currentThread().getName());
					notify();
					System.out.println(Thread.currentThread().getName());
					/*sleep(1000);
					System.out.println(Thread.currentThread().getName());*/
				}catch(Exception e){
					System.out.println(e);
				}
			}
		}
			
			
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("in"+Thread.currentThread().getName());
		final SleepVsWait s=new SleepVsWait();
		Thread s1=new Thread(){
			@Override
			public void run(){
				
					s.printTable(2);
				}
				
				
			
		};
		Thread s2=new Thread(){
			@Override
			public void run(){
				
					s.printTable(10);
				}
				
				
			
		};
		s1.setName("jyo");
		s2.setName("ravi");
		s1.start();
		s2.start();
	}

}
