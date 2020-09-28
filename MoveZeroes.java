package PWC_Practices;

import java.util.Arrays;

public class MoveZeroes {
	
	public static void reorde(int[] arr){
		int k = 0;
		for(int i : arr){
			if(i!=0){
				arr[k++] = i;
			}
		}
		
		//move all the 0s to the end of the array
		for(int i = k;i<arr.length;i++){
			arr[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {6,0,8,9,0,4,0,0,6,4};
		reorde(arr);
		System.out.println(Arrays.toString(arr));
	}

}
