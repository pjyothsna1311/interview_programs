
public class StringBufferBuilder {
	
	public static void main(String args[]){
		
		StringBuffer sb=new StringBuffer("j");
		System.out.println(sb.capacity());
		sb.append("padamata");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer(5);
		sb2.append("jyothsna padamata");
		System.out.println(sb2);
		sb2.append(sb);
		System.out.println(sb2);
		System.out.println(sb.capacity());
		System.out.println(sb.insert(0, "hai"));
		System.out.println(sb.replace(0, 5, "hello"));
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(5));
		
		//equals method test
		StringBuffer sb3=new StringBuffer("sunny");
		StringBuffer sb4=new StringBuffer("sunny");
		System.out.println(sb3.equals(sb4));
		System.out.println(sb3==sb4);
	}

}
