package PWC_Practices;

import java.util.Arrays;

public class DeepCopy {
	
	private static   int[] data;
	
	//altered to make a deep copy of the values
	public DeepCopy(int[] values){
		data = new int[values.length];
		
		for(int i = 0;i<data.length;i++){
			data[i] = values[i];
		}
	}
	
	public static void showData(){
		System.out.println(Arrays.toString(data));
	}
	
	public static void main(String[] args) {
		int[] vals = {3,7,9};
		DeepCopy dc = new DeepCopy(vals);
		dc.showData();
		vals[0] = 13;
		dc.showData();
	}

}
