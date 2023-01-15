package Day_16_Collections;

import java.util.TreeSet;
//Set : Duplicate value not allowed, TreeSet :it maintain the ascending order 
public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(123);
		ts.add(123);
		ts.add(125);
		ts.add(124);
		ts.add(127);
		ts.add(126);
		
		for(Integer i:ts) {
			System.out.println(i);
		}

	}

}
