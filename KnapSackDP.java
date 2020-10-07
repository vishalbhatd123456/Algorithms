// package whatever; // don't place package name!

import java.io.*;

class MyCode {
  
  public static int knapsackDP(int[] v, int []w, int W){
    int[][] T = new int[v.length+1][W+1];
    
    for(int i = 1;i<=v.length;i++){
      for(int j = 0;j<=W;j++){
        if(w[i-1] > j){
          T[i][j] = T[i-1][j];
        }else{
          T[i][j] = Integer.max(T[i-1][j],T[i-1][j-w[i-1]] + v[i-1]);
        }
      }
    }
    return T[v.length][W];
  }
	public static void main (String[] args) {
		System.out.println("Hello Java");
    int[] v = {20,5,10,40,15,25};
    int[] w = {1,2,3,8,7,4};
    int W = 10;
    System.out.println("Knapsack value is"+knapsackDP(v,w,W));
	}
}
