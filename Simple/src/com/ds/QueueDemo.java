package com.ds;

public class QueueDemo {

	public QueueDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q=new Queue(5);
		q.add(10);
		q.add(20);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.delete();
		
		
		while(!q.isEmpty()){
			
			long val=q.delete();
			System.out.println(val);
		}
	}

}

class Queue{
	int maxSize;
	long[] queueArray;
	int front,rear;
	
	Queue(int i){
		this.maxSize=i;
		this.queueArray=new long[maxSize];
		this.front=-1;
		this.rear=-1;
	}
	
	public void add(long j){
		if(front==-1&&rear==-1){
			front++;
			rear++;
			queueArray[front]=j;
		}
		else{
			
			if(isFull()){
				System.out.println("queue is full");
			}
			else{
				front++;
				queueArray[front]=j;
			}
			
		}
	}
	
	public long delete(){
		if(isEmpty()){
			System.out.println("queue is empty");
			return -1;
		}
		else{
			int old_rear=rear;
			rear++;
			return queueArray[old_rear];
			
			
		}
		
	}
	
	public boolean isEmpty(){
		return rear==maxSize;
	}
	
	public boolean isFull(){
		return (maxSize-1==front);
	}
	
}
