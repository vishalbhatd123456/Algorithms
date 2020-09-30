package PWC_Practices;

public class SecondLargestElem {
	
	public static int getLargestElement(int [] arr,int n){
		int largest = 0;
		for(int i=1;i<n;i++){
			if(arr[i] > arr[largest]){
				largest = arr[i]; // 3
			}
		}
		return largest;
	}
	
	public static int secondLargest(int[] arr,int n){
	int largest = getLargestElement(arr, arr.length);
	int res = -1;
	for(int i = 0;i<n;i++){
		if(arr[i]!=arr[largest]) 
		{
			if(res == -1){
				res = i;
			}else if(arr[i]> arr[res]){
				res = i;
			}
		}
		
	}
	return res;
	}
	public static void main(String[] args) {
		int[] arr = {3,2,-1,-2};
		System.out.println(secondLargest(arr, arr.length));
	}

}
