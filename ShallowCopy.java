package PWC_Practices;

import java.util.Arrays;

public class ShallowCopy {
	
	private static int[] data;
	//make a shallow copy of the values
	public ShallowCopy(int [] values){
		data =values;
	}
	
	public static void showData(){
		System.out.println(Arrays.toString(data));
	}
	
	public static void main(String[] args) {
		int[] vals = {3,7,9};
		ShallowCopy sc = new ShallowCopy(vals);
		sc.showData();
		vals[0] = 13;
		sc.showData();
	}

}
