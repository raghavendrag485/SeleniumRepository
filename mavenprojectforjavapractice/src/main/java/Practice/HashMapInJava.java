package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapInJava {

	public static void main(String[] args) {

		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Selenium");
		map.put(2, "QTP");
		map.put(3, "HTML");
		map.put(4, "UFT");
		System.out.println(map);
		
		Set<Integer>keySet=map.keySet();
		Iterator<Integer> itr=keySet.iterator();
		while(itr.hasNext()){
			System.out.println(map.get(itr.next()));
		}
	for(Entry m:map.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	
	}
	
	
	

}
