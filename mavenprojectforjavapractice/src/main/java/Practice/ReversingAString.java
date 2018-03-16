package Practice;

public class ReversingAString {

	public static void main(String[] args) {
		String s="Raghavendra";
		String s1="";
		int len=s.length();
		for(int i=len-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);

	}

}
