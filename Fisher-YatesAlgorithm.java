package PWC_Practices;

import java.util.Arrays;
import java.util.Random;

public class FischerYatesAlgoerithm {
	
	//utility function to swap the array elements
	private static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void shuffle(int[] arr){
		//read the array elements from the ighest index to the lowest index
		for(int i = arr.length-1;i>=1;i--){
			Random rand = new Random();
			int j = rand.nextInt(i+1);
			swap(arr,i,j);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		shuffle(arr);
		System.out.println(Arrays.toString(arr));
	}

}
