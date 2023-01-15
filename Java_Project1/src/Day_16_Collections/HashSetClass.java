package Day_16_Collections;

import java.util.HashSet;

//Set : Duplicate value not allowed, HashSet : Generate random order

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<Integer>hs=new HashSet<>();
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
