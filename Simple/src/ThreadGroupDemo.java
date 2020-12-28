
public class ThreadGroupDemo extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running thread is"+Thread.currentThread().getName());
		try{
			sleep(500);
			Thread.currentThread().getThreadGroup().interrupt();  
		}
		catch(Exception e){
			System.out.println(e);
		}
		//Thread.currentThread().getThreadGroup().interrupt();  
	}
	
	public static void main(String[] args) {
		
		ThreadGroupDemo t3=new ThreadGroupDemo();
		ThreadGroup tg=new ThreadGroup("Parent group thread");
		Thread t1=new Thread(tg,t3,"one");
		Thread t2=new Thread(tg,new ThreadGroupDemo(),"two");
		ThreadGroup chiildgroup=new ThreadGroup(tg,"child group");
		Thread t4=new Thread(chiildgroup,t3,"three");
		t4.start();
		
		
		t1.start();
		t2.start();
		
		tg.list();
		System.out.println(tg.activeCount());
		System.out.println(tg.activeGroupCount());
		System.out.println(tg.getParent());
		System.out.println(chiildgroup.getParent());
		//tg.interrupt();
		
	}

}
