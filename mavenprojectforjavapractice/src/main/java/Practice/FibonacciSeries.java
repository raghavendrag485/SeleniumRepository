package Practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		
		System.out.print(a+" "+b);
		for(int i=1;i<=10;i++){
			c=a+b;
			if(c<=10){
				a=b;
				b=c;
				
				System.out.print(c);
			}
			
		}

	}

}
