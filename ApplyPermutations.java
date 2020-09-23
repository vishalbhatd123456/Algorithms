package PWC_Practices;

public class ApplyPermutation {
	public static void main(String[] args) {
		int[] array = {000,100,200};
		int[] permutation = {1,2,0};
		
		int[] arr = new  int[]{50,40,70,60,90};
		int[] index = new int[]{3,0,4,1,2};
		
		permute(arr,index);
	}
	
	public static int[] swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	public static void permute(int[] array,int[] permutaiton){
		for(int i = 0;i<array.length;i++){
			int currIndex = i;
			//while the currentIndex is not at position
			
			//and permutations is valid -> SWAP with correct position elem
			
			
			//LOGIC -> everything we are swapping with is coming to its rightful posiiton
			while(i!=permutaiton[currIndex] && permutaiton[currIndex] > 0){
				swap(array, currIndex, permutaiton[currIndex]);
				
				int oldIndex = currIndex;
				currIndex = permutaiton[currIndex];
				permutaiton[oldIndex] = -1;
			}
			permutaiton[currIndex] = -1;
		}
		
		for(int x : array){
			System.out.print(x+" ");
		}
			
		
	}
	
	

}
