
/* When thread 1 is adding elem and we made thread to sleep for 50ms after adding 50 meanwhile thread 2 will execute and try to 


 * fetch the ele from 2nd index which leads to IndexOutofBounds excep*/
package Interview;

import java.util.ArrayList;

// ArrayList1 & ArrayList2 -- Threads on same obj ArrayListAdd
//Two threads trying to access Add method of ArrayListAdd
//Since AL is not synchronized we will not get the output in a proper format
//To get the output in proper format add synchronized keyword to add method, so that only one thread will be able to access it at any time
public class ArrayList_NonSync{
	
	public static void main(String[] args) {
		
		//ArrayListAdd nonsync=new ArrayListAdd();
		ArrayList1 t1=new ArrayList1();
		ArrayList2 t2=new ArrayList2();
		
		t1.start();
		/*try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t2.start();
		
	}

}
class ArrayList1 extends Thread{
	ArrayListAdd nonsync = new ArrayListAdd();
	/*public ArrayList1(ArrayListAdd nonsync2) {
		// TODO Auto-generated constructor stub
		this.nonsync=nonsync2;
	}*/
	@Override
	public void run() {
		// TODO Auto-generated method stub
		nonsync.add(10);
	}
	
}
class ArrayList2 extends Thread{
	ArrayListAdd nonsync = new ArrayListAdd();

	/*public ArrayList2(ArrayListAdd nonsync2) {
		// TODO Auto-generated constructor stub
		this.nonsync=nonsync2;
	}*/
	@Override
	public void run() {
		// TODO Auto-generated method stub
		nonsync.add(2);
	}
	
}
class ArrayListAdd{
	final ArrayList<Integer> al=new ArrayList<>();
	synchronized void add(int n){
		
			for(int i=0;i<5;i++){
				al.add(i+n);
				System.out.println(Thread.currentThread().getName());
				System.out.println(al);
			}
		
		
	}
}

/*
 * 
 * Thread-1
2
Thread-1
Thread-0
2
Thread-0
3
Thread-0
10
Thread-0
11
Thread-0
12
3
Thread-1
10
Thread-1
11
Thread-1
12*/

