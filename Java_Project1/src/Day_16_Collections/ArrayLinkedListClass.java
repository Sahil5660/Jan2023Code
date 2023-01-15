package Day_16_Collections;

import java.util.LinkedList;

//List: allow duplicate, LinkedList : Maintain order
//Although output is same in Array list and Linked List but searching is faster in Array List because searching will happen on the index number
//Searching is slower in linked list bcs it work on node and node contain two things Data and Next node address so we cannot search directly last node
//Insertion and deletion is faster in case of Linked List

public class ArrayLinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(123);
		ll.add(123);
		ll.add(125);
		ll.add(124);
		ll.add(127);
		ll.add(126);
		
		for(Integer i:ll) {
			System.out.println(i);
		

	}

}}
