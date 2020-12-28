package Interview;

public class Singleton {
	public static void main(String[] args) {
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		x.s=(x.s).toUpperCase();
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		z.s=(z.s).toLowerCase();
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
	}
	
	public static Singleton single_instance=null;
	String s;
	private Singleton(){
		s="Jyothsna";
	}
	
	public static Singleton getInstance(){
		if(single_instance==null)
			single_instance=new Singleton();
		return single_instance;
	}

}
