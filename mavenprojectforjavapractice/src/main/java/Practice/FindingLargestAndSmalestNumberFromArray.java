package Practice;

public class FindingLargestAndSmalestNumberFromArray {

	public static void main(String[] args) {
		int a[]={1,3,4,-1,5,-6,-255,66};
		int smallest=a[0];
		int largest=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>largest){
				largest=a[i];
			}
			else if(a[i]<smallest){
				smallest=a[i];
			}
		}
		System.out.println("smalest number is:"+smallest);
		System.out.println("largest number is:"+largest);

	}

}
