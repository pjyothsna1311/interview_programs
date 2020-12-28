import java.util.Comparator;
import java.util.PriorityQueue;


public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(10);
		pq.add(10);
		pq.add(100);
		pq.add(20);
		System.out.println(pq);
		
		PriorityQueue<String> pq1=new PriorityQueue<String>();
		pq1.add("Jyo");
		pq1.add("Jyo");
		pq1.add("Ravi");
		pq1.add("Ravi");
		pq1.add("Amaleswari");
		
		//No Null values are allowed
//		pq1.add("Amaleswari");
		//pq1.add(null);
		System.out.println(pq1);
		
		PriorityQueue<Percent> pq2=new PriorityQueue<Percent>();
		pq2.offer(new Percent("jyo", 20, 90));
		/*pq2.offer(new Percent("jyo", 20, 90));
		pq2.offer(new Percent("Phani", 21, 80));*/
		for(Percent p:pq2){
			System.out.println(p.id+"   "+p.name+"   "+p.percent);
		}
	}
}

class Percent implements Comparator<Percent>{
	
	String name;
	int id;
	int percent;
	
	Percent(String name,int id,int percent){
		this.name=name;
		this.id=id;
		this.percent=percent;
		
	}
	@Override
	
	public int compare(Percent p1,Percent p2) {
		// TODO Auto-generated method stub
		return p1.percent-p1.percent;
	}

	
	
}
