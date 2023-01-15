package Day_16_Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

//Duplicate Key is not allowed if you are providing duplicate key then it will override and will pick latest duplicate value
//Duplicate value is allowed in case of Value
//Maintain order 

public class LinkedHashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer, String>hm=new LinkedHashMap<Integer,String>();
		
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
