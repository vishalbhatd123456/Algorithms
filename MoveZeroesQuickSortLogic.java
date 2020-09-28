package PWC_Practices;

import java.util.Arrays;

public class MoveZeroes2 {
	
	
	private static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void partition(int[] arr){
		int j = 0;
		
		//each time a non-zero is encountered, j is incremented
		//and the element is placed before the pivot
		
		
		for(int i = 0;i<arr.length;i++){
			//pivot is zero
			if(arr[i] != 0){
				swap(arr,i,j);
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,0,3,2,0,};
		partition(arr);
		System.out.println(Arrays.toString(arr));
	}

}
