package com.ds;

public class ReverseStringUsingStack {

	public ReverseStringUsingStack() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hello"));
	}
	
	public static String reverseString(String str){
		int size=str.length();
		Reverse r=new Reverse(size);
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			r.push(ch);
			}
		String result="";
		while(!r.isEmpty()){
			char c=r.pop();
			result=result+c;
		}
		return result;
		}
	}



class Reverse{
	int maxSize;
	char[] stackArray;
	int top;
	
	Reverse(int i){
		this.maxSize=i;
		this.stackArray=new char[maxSize];
		this.top=-1;
		
	}
	
	public void push(char j){
		if(isFull()){
			System.out.println("stack is full");
		}
		else{
			top++;
			stackArray[top]=j;
		}
		
		
	}
	
	public char pop(){
		if(isEmpty()){
			System.out.println("stack is empty");
			return '0';
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
