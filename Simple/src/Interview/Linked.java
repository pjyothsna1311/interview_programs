package Interview;

import java.util.ArrayList;
import java.util.Iterator;

class Nodes {
	
	int data;
	Linked next;
	Nodes(int data){
		this.data=data;
		
	}
	void display(){
		System.out.println(data);
	}

}

public class Linked{
	ArrayList<Nodes> al=new ArrayList<>();
	Nodes sln=new Nodes(20);
	Nodes sln1=new Nodes(30);
	Nodes sln2=new Nodes(40);
	public static void main(String[] args) {
		
		Linked sl=new Linked();
		sl.insert();
		sl.display();
		sl.delete(40);
		
	}
	void insert(){
		al.add(sln);
		al.add(sln1);
		al.add(sln2);
		sln.display();
	}
	void display(){
		for(Nodes n:al){
			System.out.println(n.data);
		}
	}
	void delete(int data){
		int x=data;
		Iterator<Nodes> i=al.iterator();
		while(i.hasNext()){
			Nodes n=(Nodes)i.next();
			if(n.data==x){
				i.remove();
			}
			System.out.println(n.data);
		}
	}
	
	
	
	
	
}
