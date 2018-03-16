package Practice;

public class StringManipulation {

	public static void main(String[] args) {
		String str="Raghavendra is going to get job soon";
		String str1="Raghavendra Is going to get job soon";
		System.out.println(str.length()); //finding length of the string
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.charAt(5));// it will return index 5 value
		
		System.out.println(str.indexOf('s')); //it will return first occurrence of 's'
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		
		System.out.println(str.substring(0, 19));//sub string
		
		String s="       raghu is a good boy     ";
		
		System.out.println(s.trim()); //removing after space and before space
		
		System.out.println(s.replace(" ", ""));//removing middle space and after space,before space
		
		String date="29-11-2017";
		
		System.out.println(date.replace("-", "/"));
		
		String test="Hello_Raghavendra_welcome to_css corp";	

	}

}
