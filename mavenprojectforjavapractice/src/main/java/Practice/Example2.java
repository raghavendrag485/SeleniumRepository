package Practice;
// if any number is divisible by 3 is replaced by the word moto and any num
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {

		int arr[]={1,3,8,5,15,18};
		int length=arr.length;
		String sr[]=new String[length];
		
		for(int i=0;i<length;i++){
			if(arr[i]%(3*5)==0){
				sr[i]="motocar";
			}else if(arr[i]%3==0){
				sr[i]="moto";
			}else if(arr[i]%5==0){
				sr[i]="car";
			}else{
				sr[i]=Integer.toString(arr[i]);
			}
		}
		System.out.println(Arrays.deepToString(sr));
		
		
		
		
	}

}
