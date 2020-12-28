package Interview;

class Ticket extends Thread {
	
	int ticketsAvailable=1;
	
	@Override
	public void run(){
		//synchronized (this) {
			 System.out.println("Waiting to book ticket for : "+Thread.currentThread().getName());
	         if(ticketsAvailable>0){
	                System.out.println("Booking ticket for : "+Thread.currentThread().getName());
	                
	                //Let's say system takes some time in booking ticket (here we have taken 1 second time)
	                try{
	                      Thread.sleep(1000); 
	                }catch(Exception e){}
	                  
	                ticketsAvailable--;
	                System.out.println("Ticket BOOKED for : "+ Thread.currentThread().getName());
	                System.out.println("currently ticketsAvailable = "+ticketsAvailable);
	         }
	         else{
	                System.out.println("Ticket NOT BOOKED for : "+ Thread.currentThread().getName());
	         }
		//}
		 
  
		
	}

	
		/*RaceCondition r1=new RaceCondition();
		RaceCondition r2=new RaceCondition();
		r1.start();
		r2.start();*/
	}

public class Passenger{
	
	public static void main(String[] args) {
		Ticket t=new Ticket();
		Thread t1=new Thread(t,"jyo");
		Thread t2=new Thread(t,"ravi");
		t1.start();
		t2.start();
		
	}
	
}