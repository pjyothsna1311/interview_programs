import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Inputs {

	public static void main(String args[]){
		
		//Buffered reader 
		
		try{
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			
			System.out.println("enter name");
			String name=br.readLine();
			System.out.println("enter age");
			String age=br.readLine();
			int n=Integer.parseInt(age);
			System.out.println(name+ " "+n);
			
		}
		catch (IOException ioe) {
            ioe.printStackTrace();
        }
		
		//Scanner
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String name1=s.nextLine();
		System.out.println("enter age");
		int age1=s.nextInt();
		System.out.println(name1+ " "+age1);
		
		//Console
		Console c=System.console();
		System.out.println("enter name");
		String name2=c.readLine();
		System.out.println("enter age");
		String age=c.readLine();
		int n2=Integer.parseInt(age);
		System.out.println(name2+ " "+n2);
		
	}
}
