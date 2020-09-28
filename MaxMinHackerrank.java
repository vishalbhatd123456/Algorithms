package PWC_Practices;

import java.util.Arrays;

public class MinMax {
	
	public static int maxmin(int k,int[] arr){
		int n = arr.length;
		Arrays.sort(arr);
		int answer = Integer.MAX_VALUE;
		
		for(int i = 0;i+k-1<n;i++){
			answer = Math.min(arr[i+k-1]-arr[i],answer);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,8,7,6};
		System.out.println(maxmin(3, arr));
	}

}
