package Interview;



public class GenericClass {

	public static void main(String[] args) {
		
		Generic<Integer> g=new Generic<>();
		g.add(2);
		System.out.println(g.get());
		//g.add("jyo"); will throw compile time error 
		Integer[] intArray={1,2,3};
		Character[] charArray={'j','y'};
		Generic.printArray(intArray);
		Generic.printArray(charArray);
		
	}
}


//Generic class
class Generic<T>{
	
	T obj;
	void add(T obj){
		this.obj=obj;
		
	}
	
	T get(){
		return obj;
	}
	
	//Generic Method+
	public static<E> void printArray(E[] ele){
		for(E element:ele){
			System.out.println(element);
			
		}
		
	}
	
}
