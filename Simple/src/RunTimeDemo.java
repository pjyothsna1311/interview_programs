import java.io.IOException;


public class RunTimeDemo {
	public static void main(String[] args) throws IOException {
		System.out.println(Runtime.getRuntime().freeMemory());
		Runtime.getRuntime().exec("notepad");
		
	}

}
