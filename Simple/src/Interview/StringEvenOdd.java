package Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class StringEvenOdd {

	public StringEvenOdd() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	 public static void main(String []argh){
		 	
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        HashMap<String, Integer> hm=new HashMap<>();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            // Write code here
	            hm.put(name, phone);
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            if(s.isEmpty())
	            	System.exit(0);
	            else{
	            	if(hm.containsKey(s)){
		            	Object value=hm.get(s);
		            	System.out.println(s+"="+value);
		            	
		            }
		            else
		            	System.out.println("Not Found");
	            }
	            	
	            
	            	
	        }
	        in.close();
	    }

}
