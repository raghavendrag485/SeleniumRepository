package Practice;

public class BubleSort {
	
	public static void bubleSort(int array[]){
		int temp;
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]={4,1,2,5,9,6};
		bubleSort(arr);
		System.out.println("array aftersort");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
