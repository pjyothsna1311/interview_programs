
public class ThreadPriority extends Thread{
	String name;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Executing thread"+name+"  "+Thread.currentThread().getPriority());
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon thread");
		}
		else
			System.out.println("user thread");
	}
	ThreadPriority(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		ThreadPriority t1=new ThreadPriority("jyo");
		ThreadPriority t2=new ThreadPriority("phani");
		ThreadPriority t3=new ThreadPriority("sunny");
		t2.setPriority(MAX_PRIORITY);
		t1.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		ThreadPriority t4=new ThreadPriority("papai");
		ThreadPriority t5=new ThreadPriority("pranu");
		t4.setDaemon(true);
		t4.start();
		t5.start();
		/* *
		 * We can't make an user thread as a Daemon thread after starting it. Before starting the thread itself we must set it as 
		 * Daemon thread
		
		//t5.setDaemon(true);*/
		
	}

}
