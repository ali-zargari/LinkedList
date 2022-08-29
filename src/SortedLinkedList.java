import java.util.*;

/* Name: Ali Zargari
 * Enrollment Status: ENROLLED
 */

/*
 * This simple doubly linked list class maintains a doubly linked list
 * with elements in that are in sorted order (smallest to largest)
 * i.e., the smallest value is in the head node 
 * and the largest value is in the tail node
 */

public class SortedLinkedList {
	
	/*
	 * DO NOT MODIFY
	 */
	
	private static class Node {
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	/*
	 * DO NOT MODIFY
	 * Returns whether or not a list is empty
	 */
	public boolean isEmpty() { return head==null && tail==null; }
	
	/*
	 * DO NOT MODIFY
	 * Returns the value in the head node
	 */
	public int getHeadData() {
		return head.data;
	}
	
	/*
	 * DO NOT MODIFY
	 * Returns the value in the tail node
	 */
	public int getTailData() {
		return tail.data;
	}
	
	/*
	 * DO NOT MODIFY
	 * toString method to use for testing
	 */
	public String toString() {
		String s = "";
		if(isEmpty())
			return s;
		Node current = head;
		while(current!=null) {
			s = s+current.data + ",";
			current = current.next;
		}
		return s.substring(0,s.length()-1);
	}

	
	 /****** THIS IS WHERE YOUR IMPLEMENTATION STARTS******/
	 
	
	/**
	 * Inserts a new node in the linked list with data equal to i
	 * Maintains the sorted order of the list
	 */
	public void insert(int i) {
		Node toInsert = new Node(i);

		//----case where i is invalid----
		if(toInsert == null)
			return;

		//----case where list is empty----
		if(isEmpty()){
			head = toInsert;
			tail = head;
			return;
		}

		//----cases where list has items----

		//if item is less than or equal to head.
		if(toInsert.data <= head.data){
			toInsert.next = head;
			head.prev = toInsert;
			head = toInsert;
			return;
		}

		//if item is greater than or equal to tail.
		if(toInsert.data >= tail.data){
			tail.next = toInsert;
			toInsert.prev = tail;
			tail = toInsert;
			return;
		}

		//item belongs somewhere in the middle of a non-empty list

		Node temp = head.next;
		while(temp != null){

			if(toInsert.data >= temp.data
			&& toInsert.data <= temp.next.data){
				toInsert.next = temp.next;
				temp.next.prev = toInsert;
				temp.next = toInsert;
				toInsert.prev = temp;
				break;
			}
			temp = temp.next;
		}
		
	}
	
	/**
	 * This method returns true if the list is in sorted order
	 */
	public boolean isSorted() {
		Node temp = head;
		while(temp != null){
			if(temp.data > temp.next.data){ return false;}
			temp = temp.next;
		}
		return true;
	}
	
	/**
	 * This method returns a Java LinkedList of integers that matches the SortedLinkedList
	 */
	public LinkedList<Integer> getAscending(){
		LinkedList<Integer> asc = new LinkedList<>();
		
		return asc;
		
	}
	
	/**
	 * This method returns a Java LinkedList of integers that is the SortedLinkedList
	 * but in descending order (from largest to smallest)
	 */
	public LinkedList<Integer> getDescending(){
		LinkedList<Integer> desc = new LinkedList<>();
		
		return desc;
	}
	
	

}
