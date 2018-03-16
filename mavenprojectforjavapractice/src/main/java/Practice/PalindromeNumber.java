package Practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=121;
		int temp,sum=0,c;
		temp=n;
		while(n>0){
			c=n%10;
			sum=sum*10+c;
			n=n/10;
			
		}
		if(temp==sum){
			System.out.println("number is palindrom");
			
		}
		else{
			System.out.println("number is not palindrom");
		}
	}

}
