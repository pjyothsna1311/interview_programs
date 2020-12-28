package Interview;

import java.util.ArrayList;
import java.util.List;

public class WildCharInGenerics {
	
	public static void drawShape(List<? extends Shape> lists){
		
		for(Shape s:lists){
			s.draw();
		}
	}
	
	public static void main(String[] args) {
		
		List<Rectangle> list1=new ArrayList();
		list1.add(new Rectangle());
		List<Circle> list2=new ArrayList<>();
		list2.add(new Circle());
		drawShape(list1);
		drawShape(list2);
		
		
	}

}

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("rectangle");
	}
	
}

class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
}
