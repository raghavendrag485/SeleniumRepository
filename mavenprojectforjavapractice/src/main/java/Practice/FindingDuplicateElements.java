package Practice;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateElements {

	public static void main(String[] args) {
		String[] names={"java","selenium","bdd","javascript","c","java"};
		
		Set<String> store=new HashSet<String>();
		for(String name:names){
			if(store.add(name)==false){
				System.out.println(name);
			}
		}
		

	}

}
