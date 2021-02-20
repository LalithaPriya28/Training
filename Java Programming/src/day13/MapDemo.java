package day13;

import java.util.HashMap;
import java.util.LinkedHashMap;



public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap hm=new HashMap();
			
			hm.put(1, "Sachin");
			hm.put("name", "rahul");
			
			System.out.println(hm);
			HashMap<Integer,String> hm2=new HashMap<Integer,String>();
			HashMap<String,String> hm3=new HashMap<String,String>();
			hm3.put("Sachin", "he is an opening batsman");
			hm3.put("Rahane", "is a vice captain");
			hm3.put("Bumrah", "opening bowler");
			
			System.out.println("Hashmap: "+hm3);
			System.out.println("getting value from key "+hm3.get("Bumrah"));
			hm3.replace("Rahane", "is a vice captain", "Captain");
			hm3.remove("Sachin");
			System.out.println("After replacement,Hashmap: "+hm3);
			
			System.out.println("Returns all keys present "+hm3.keySet());
			hm3.entrySet();
			System.out.println("Returns all values present "+hm3.values());
			
			
			
			LinkedHashMap<String,String> hm4=new LinkedHashMap<String,String>();
			hm4.put("Sachin", "he is an opening batsman");
			hm4.put("Rahane", "is a vice captain");
			hm4.put("Bumrah", "opening bowler");
			
			System.out.println("Hashmap: "+hm4);
			
			
	}

}
