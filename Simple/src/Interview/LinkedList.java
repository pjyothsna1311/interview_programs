package Interview;

public class LinkedList {
	
	public static void main(String[] args) {
		
		LinkedListDemo list=new LinkedListDemo();
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertLast(5);
		list.insertLast(6);
		list.insertLast(7);
		list.deleteFirst();
		list.printLinkedList();
		list.lengthOfLinkedList();
		list.findMiddle();
	}

}
class Node{
	public int data;
	public Node next;
	
	public void displayNodeData(){
		System.out.println("{"+data+"}");
	}
}

class LinkedListDemo{
	private Node head;
	public boolean isEmpty(){
		return(head==null);
	}
	
	//used to insert a node at the start of LL
	public void insertFirst(int data){
		
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=head;
		head=newNode;
		
	}
	
	//used to del node from start of LL
	public Node deleteFirst(){
		Node temp=head;
		head=head.next;
		return temp;
		
	}
	
	//used to del Node after particular node
	public void deleteAfter(Node after){
		Node temp=head;
		while(temp.next!=null&&temp.data!=after.data){
			temp=temp.next;
	}
	if(temp.next!=null){
		temp.next=temp.next.next;
	}
}
	//used to insert a node at last
	public void insertLast(int data){
		Node current=head;
		while(current.next!=null){
			current=current.next;
		}
		Node newNode=new Node();
		newNode.data=data;
		current.next=newNode;
	}
	public void printLinkedList(){
		Node current=head;
		while(current!=null){
			current.displayNodeData();
			current=current.next;
			
		}
	}
	
	// to find the length of LL
	public void lengthOfLinkedList(){
		Node temp=head;
		int count=0;
		while(temp!=null){
			temp=temp.next;
			count++;
			
		}
		System.out.println(count);
	}
	
	//to find middle ele of LL
	public void findMiddle(){
		Node slow,fast;
		slow=fast=head;
		while(fast!=null){
			fast=fast.next;
			if(fast!=null&&fast.next!=null){
				fast=fast.next;
				slow=slow.next;
			}
		}
		System.out.println(slow.data);
		
		
	}
}