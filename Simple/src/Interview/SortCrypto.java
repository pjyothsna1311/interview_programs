
package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ravi.*;
public class SortCrypto {
	
	public static void main(String[] args) {
		SortCrypto s1=new SortCrypto();
		Crypto c1=new Crypto("abc","iq",30,20);
		Crypto c2=new Crypto("def","tron",10,40);
		ArrayList<Crypto> al=new ArrayList<>();
		al.add(c1);
		al.add(c2);
		Collections.sort(al, new Comparator_marketcap());
		for(Crypto c : al){
			System.out.println(c.getName());
		}


	}
	
public String toString(Crypto c){
	return c.getName()+" "+c.getCode()+" "+c.getMarketCap()+" "+c.getTotalSupply();
	
}
}

class Comparator_marketcap implements Comparator<Crypto>{

	@Override
	public int compare(Crypto c1, Crypto c2) {
		// TODO Auto-generated method stub
		if(c1.getMarketCap()==c2.getMarketCap())
			return 0;
		else if(c1.getMarketCap()>c2.getMarketCap())
			return 1;
		else return -1;
	}
	
}

