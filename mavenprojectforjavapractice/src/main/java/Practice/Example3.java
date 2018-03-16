package Practice;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
	public static void main(String args[]){
		
		int arr[]={1,3,8,5,15,18};
		List<Object> list=new ArrayList<Object>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]%(3*5)==0){
				list.add("motocar");
			}
				else if(arr[i]%3==0){
					list.add("moto");
				}
				else if(arr[i]%5==0){
					list.add("car");
				}else{
					
					list.add(arr[i]);
				}
			System.out.print(list);
			}
		
	}

}
