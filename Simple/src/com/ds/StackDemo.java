package com.ds;

public class StackDemo {

	public static void main(String[] args) {
		Stack stack=new Stack(3);
		stack.push(20);
		stack.push(10);
		stack.push(50);
		stack.push(60);
		stack.pop();
		stack.pop();
		stack.peek();
			while(!stack.isEmpty()){
				long value=stack.pop();
				System.out.println(value);
			}
		
		
	}
	

}

class Stack{
	
	int maxSize;
	long[] stackArray;
	int top;
	
	Stack(int i){
		this.maxSize=i;
		this.stackArray=new long[maxSize];
		this.top=-1;
		
	}
	
	public void push(long j){
		if(isFull()){
			System.out.println("stack is full");
		}
		else{
			top++;
			stackArray[top]=j;
		}
		
		
	}
	
	public long pop(){
		if(isEmpty()){
			System.out.println("stack is empty");
			return -1;
		}
		else{
			int old_top=top;
			top--;
			
			return stackArray[old_top];
		}
		
	}
	
	public long peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public boolean isFull(){
		return ((maxSize-1)==top);
	}
	
	
}
