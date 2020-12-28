import java.io.*;
import java.util.*;
public class Factoria {
	public static void main(String args[]){
		try{
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			System.out.println("enter any num");
			String num=br.readLine();
			int n=Integer.parseInt(num);
			int fact=1;
			
			for(int i=1;i<=n;i++){
				
				fact=fact*i;
				
			}
			System.out.println(fact);
		}
		catch (IOException ioe) {
            ioe.printStackTrace();
        }
		
		
		
		
	}

}
