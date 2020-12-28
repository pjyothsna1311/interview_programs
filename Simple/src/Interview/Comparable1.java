package Interview;
import java.util.ArrayList;
import java.util.Collections;

public class Comparable1 {
	public static void main(String[] args) {
		ArrayList<Employee> a=new ArrayList<>();
		Employee e1=new Employee("jyo", 10, 25);
		Employee e2=new Employee("ravi", 28, 28);
		Employee e3=new Employee("phani", 25, 23);
		a.add(e1);
		a.add(e2);
		a.add(e3);
		System.out.println("before sorting"+a);
		Collections.sort(a);
		System.out.println("after sorting"+a);
		
	}

}
class Employee implements Comparable<Employee>{
	String name;
	int id;
	int age;
	public Employee(String name,int id,int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
		this.age=age;
	}
	@Override
    public int compareTo(Employee e) {
       //sort Employee on basis of name(ascending order)
		
		//Logic to compare based on name in ascending order
      // return this.name.compareTo(e.name);
		//return e.name.compareTo(this.name)     logic to compare based on name in descending order
      //Logic to compare based on age
		/*if(this.age==e.age)
       	return 0;
        else if(this.age>e.age)
        	return 1;
        else
        	return -1;*/
		return e.age - this.age; //to sort in desc order
       
       
    }
    
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+id+age;
	}
 
	
}
