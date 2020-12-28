package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] names = {"Jyothsna", "Ravi", "Sunny", "Phani", "Papai", "Mtm", "Gudivada", "Bnglr"};
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
		System.out.println("After Sorting: ");
		Arrays.sort(names);
		
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		/*String s;
		String[] names1=new String[10];
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		names[0] = sc.next();*/
		
		sortStudents(getStudentsList());
	}
	
	public static Student[] getStudentsList(){
		Student ravi = new Student(1, "ravi", "MT", 1);
		Student jyo = new Student(5, "jyo", "MT", 2);
		Student phani = new Student(3, "phani", "MT", 4);
		Student sunny = new Student(4, "sunny", "MT", 5);
		Student pranu = new Student(2, "pranavi", "MT", 6);
		Student xxx = new Student(6, "xxx", "MT", 3);
		
		Student[] students={ravi,jyo,phani,sunny,pranu,xxx};
		return students;
	}
	
	public static Student[] sortStudents(Student[] students){
		Arrays.sort(students);
		return students;
	}
	

}

class Student{
	int rollNo;
	String name;
	String dept;
	int rank;
	
	Student(int rollNo, String name, String dept, int rank){
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.rank = rank;
	}
}
