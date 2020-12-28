import java.io.IOException;


public class ThrowsExample {
	
	void validate() throws IOException{
	
		throw new IOException("Checked excep");
	}
	void m() throws IOException{
		
		validate();
	}
	
	void n() throws IOException{
		
		m();
		
		/*catch(Exception e){
			System.out.println("checked exccep handled");
		}*/
	}
	
	public static void main(String[] args) {
		
		ThrowsExample t=new ThrowsExample();
		try{
		t.n();
		}
		catch(IOException e){
			System.out.println("handled");
			
		}
		System.out.println("rest of code");
		
	}

}
