package Day_16_Collections;

import java.util.ArrayList;

//List: allow duplicate, ArrayList : Maintain order
//Although output is same in Array list and Linked List but searching is faster in Array List because searching will happen on the index number
//Searching is slower in linked list bcs it work on node and node contain two things Data and Next node address so we cannot search directly last node
//Insertion and deletion is faster in case of Linked List as comparison to ArrayList
public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(123);
		al.add(123);
		al.add(125);
		al.add(124);
		al.add(127);
		al.add(126);
		
		for(Integer i:al) {
			System.out.println(i);
		}


	}

}
