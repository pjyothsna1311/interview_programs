package Interview;

public class Voltaile extends Thread {
	
	 static int x=0,y=0;
     static void method1(){
    	 x++;
    	 y++;
    	 System.out.println("method");
     }
     static void method2(){
    	 System.out.println(x+""+y);
     }
    
	public static void main(String[] args) {
		Voltaile v1=new Voltaile(){
		
			@Override
			public void run(){
			for(int i=0;i<10;i++)
				method1();
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		};
		Voltaile v2=new Voltaile(){
			@Override
			public void run(){
			for(int i=0;i<10;i++)
				method2();
		}
		};
		v1.start();
		v2.start();
	}
}
