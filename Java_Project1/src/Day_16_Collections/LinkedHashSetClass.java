package Day_16_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
//Set : Duplicate value not allowed, LinkedHashSet :it maintain the order 
public class LinkedHashSetClass {

	public static void main(String[] args) {
		LinkedHashSet<Integer>hs=new LinkedHashSet<>();
		hs.add(123);
		hs.add(123);
		hs.add(124);
		hs.add(125);
		hs.add(126);
		hs.add(127);
		
		for(Integer i:hs) {
			System.out.println(i);
		}

	

	}

}
