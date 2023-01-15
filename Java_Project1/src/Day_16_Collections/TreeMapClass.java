package Day_16_Collections;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
//Duplicate Key is not allowed if you are providing duplicate key then it will override and will pick latest duplicate value
//Duplicate value is allowed in case of Value
//Work in ascending order

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer, String>hm=new TreeMap<Integer,String>();
		
		hm.put(12, "Deepak");
		hm.put(2, "Sahil");
		hm.put(3, "Sharma");
		hm.put(4, "Rahul");
		
		Set<Integer>allKeys=hm.keySet();
		
		for(Integer i:allKeys) {
			System.out.print("Key is "+i);
			System.out.println(" Value is "+hm.get(i));
	}
	}

}
