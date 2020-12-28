
public class ThreadSleep extends Thread{
	
	String name;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println("thread is executing"+name+"   "+i+"   "+Thread.currentThread().getName());
				sleep(5000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread finished executing"+name+"   "+i);
		}
		
	}
	
	ThreadSleep(String name) {
		this.name=name;	
	}
	
	public static void main(String[] args) {
		
		ThreadSleep t1=new ThreadSleep("jyo");
		ThreadSleep t2=new ThreadSleep("phani");
		ThreadSleep t3=new ThreadSleep("sunny");
		t1.setName("hello thread");
		t3.setPriority(MAX_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t1.setPriority(MIN_PRIORITY);
		t1.start();
		System.out.println(t1.getName());
		
		// Join method will make the currently executing threads to die until thr thread which joins completes its task(i.e here t2 and t3 will stop executing until t1 
		//finishes its execution
		try{  
			  t1.join();  
			 }catch(Exception e){System.out.println(e);}  
		//t1.run();
		//t1.interrupt();    Exception will be thrown here as we interrupted the thread. This will ne only for one time
		t2.start();
		//t2.run();  
		
		//t2.interrupt();
		t3.start();
	}

}
