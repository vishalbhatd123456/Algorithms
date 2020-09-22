import java.util.*;
//BRUTE FORCE: TC: 0(N2)  SC: 0(N)
class Program {
  public static List<Integer> rightSmallerThan(List<Integer> array) {
    List<Integer> rightSmallerCounts = new ArrayList<Integer>();
		for(int i = 0;i<array.size();i++){
			int rightSmallerCount = 0;
			for(int j = i+1;j<array.size();j++)
			{
				//calc the right smaller elem
				if(array.get(i) > array.get(j)){
					rightSmallerCount++;
				}
			}
			rightSmallerCounts.add(rightSmallerCount);
		}
		return rightSmallerCounts;
  }
}
