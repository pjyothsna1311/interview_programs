package Interview;

import java.util.Vector;

public class Vector_Sync extends Thread {
	
	
	public static void main(String[] args) {
		 final Vector<Integer> v=new Vector<Integer>();
		 VectorSyncDemo sync=new VectorSyncDemo();
		 VectorDemo1 v1=new VectorDemo1(sync);
		 VectorDemo2 v2=new VectorDemo2(sync);
		 v1.start();
		 try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 v2.start();
	}
}

class VectorDemo1 extends Thread{
	public VectorDemo1(VectorSyncDemo sync) {
		// TODO Auto-generated constructor stub
		this.sync=sync;
	}

	VectorSyncDemo sync;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		sync.add(10);
	}
	
	
}
class VectorDemo2 extends Thread{
	VectorSyncDemo sync;
	public VectorDemo2(VectorSyncDemo sync) {
		// TODO Auto-generated constructor stub
		this.sync=sync;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		sync.add(2);
	}

	
}

class VectorSyncDemo{
	Vector<Integer> v=new Vector<>();
	void add(int n){
		for(int i=0;i<5;i++){
			v.add(i+n);
			System.out.println(Thread.currentThread().getName());
			System.out.println(v);
		}
	}
}
