package Practice;

import java.util.HashSet;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		int n=123456;
		Set<Integer> set=new HashSet<Integer>();
		
		System.out.println(n);
		for(int i=0;i<n;i++)
		{
			if(i%2==0){
				System.out.println("after conversion"+i);
			}
			else{
				System.out.println(i);
			}
			
		}
		

	}

}
