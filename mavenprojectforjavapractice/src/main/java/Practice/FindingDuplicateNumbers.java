package Practice;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number={1,2,3,4,4,1,3};
		Set<Integer> numbers=new HashSet<Integer>();
		for(int dupli:number){
			if(!numbers.add(dupli)){
				System.out.println(dupli);
			}
		}

	}

}
