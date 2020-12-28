import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Jyo");
		ts.add("Jyo");
		
		//Treeset doesn't allow null values
		//ts.add(null);
		ts.add("Ravi");
		System.out.println(ts);
		
		//Elements inserted in TS must be of comparable type i.e mutually comparable otherwise ClassCastExcep will be thrown
		/*TreeSet<Object> ts1=new TreeSet<Object>();
		ts1.add("Phani");
		ts1.add(20);*/
		
		Compare c=new Compare();
		
		Marks m3=new Marks("jyo",90,21);
		Marks m4=new Marks("jyo",100,21);
		Marks m5=new Marks("phani",80,20);
		
		//Using comparator
		TreeSet<Marks> ts1=new TreeSet<Marks>(c);
		ts1.add(m3);
		ts1.add(m4);
		ts1.add(m5);
		//System.out.println(ts1);
		Iterator i=ts1.iterator();
		while(i.hasNext()){
			Marks m=(Marks)i.next();
			System.out.println(m.percent+"  "+m.id+"    "+m.name);
			
			
		}
		
	}
}
		
		class Marks {
			String name;
			int percent;
			int id;
			public Marks(String name, int percent,int id) {
				// TODO Auto-generated constructor stub
				
				this.name=name;
				this.percent=percent;
				this.id=id;
			}
		}
		
		class Compare implements Comparator<Marks>{

			@Override
			public int compare(Marks m1, Marks m2) {
				// TODO Auto-generated method stub
				if(m1.id==m2.id){
					return 0;
				}
				else{
					return m1.percent-m2.percent;
				}
			}
			
		}
		
		
		

