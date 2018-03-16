package Practice;

import java.util.HashSet;
import java.util.Set;


public class FindingDuplicateCharacter {

	public static void main(String[] args) {

		String s="Raghavendraa";
		Set<Character> set=new HashSet<Character>();
		for(char duplicate:s.toCharArray()){
			if(!set.add(duplicate)){
				System.out.println(duplicate);
			}
		}
	}
}
