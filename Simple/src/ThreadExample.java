
// Creating a thread by extending Thread class
public class ThreadExample extends Thread{
	
	String name;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("thread running"+"  "+name);
		
	}
	ThreadExample(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		ThreadExample t1=new ThreadExample("jyothsna");
		ThreadExample t2=new ThreadExample("phani");
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		
		t1.start();
		/*try {
			t1.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t2.start();
		/*try {
			t2.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//t2.stop();
		//t2.interrupt();
		
		ThreadUsingInterface t3=new ThreadUsingInterface();
		System.out.println(t3.getName());
		t3.start();
		System.out.println(t3.isAlive());
		/*try {
			t3.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(t3.isAlive());
		
		//Although we implement Runnable interface we must create a Thread class obj
		ThreadUsingInterfaceWithoutExtend t4=new ThreadUsingInterfaceWithoutExtend();
		Thread t5=new Thread(t4);
		t5.start();
		t5.setPriority(MAX_PRIORITY);
		
	/*	try {
			t5.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		 try  
	        { 
	            System.out.println("Welcome"); 
	            Thread.sleep(1500); 
	            System.out.println("To"); 
	            Thread.sleep(1500); 
	            System.out.println("Java"); 
	            Thread.sleep(1500); 
	        } 
	            catch(InterruptedException e1) {} 
	    } 
	}




class ThreadUsingInterface extends Thread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread creating using interface runnable");
	}
	
}

//Creating a thread by implementing Runnable Interface

class ThreadUsingInterfaceWithoutExtend implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread created using interface but not extending thread class");
	}
	
}