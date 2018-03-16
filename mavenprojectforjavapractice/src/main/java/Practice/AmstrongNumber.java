package Practice;

public class AmstrongNumber {

	public static void main(String[] args) {
		int n=155;
		int temp,sum=0,c;
		temp=n;
		while(n>0){
			c=n%10;
			n=n/10;
			sum=sum+(c*c*c);
			
		}
		if(temp==sum){
			System.out.println("number is amstrong number");
		}
		else
		{
			System.out.println("number is not amstrong number");
		}

	}

}
