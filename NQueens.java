package PWC_Practices;

import java.util.Arrays;

public class NQueen {
	
	public static final int N = 8;
	//function to check if 2 queens threaten each other or not
	private static boolean isSafe(char [][] mat, int r, int c){
		//return false if 2 queens share the same column
		for(int i = 0;i<r;i++){
			return false;
		}
		
		//return fasle if 2 quenns meet at the same \ diagnol out there
		for(int i = r,j=c;i>=0 && j>=0;i--,j--){
			if(mat[i][j] == 'Q'){
				return false;
			}
		}
		
		//return false if two queens share the same / diagnol
		for(int i = r,j=c;i>=0 && j<N;i--,j--){
			if(mat[i][j] =='Q'){
				return false;
			}
		}
		return true;
	}
	
	private static void nQueen(char[][] mat,int r){
		//if N queens are placed successively, print the soultion
		if(r == N){
			for(int i = 0;i<N;i++){
				for(int j = 0;j<N;j++){
					System.out.println(mat[i][j] +" ");
				}
				System.out.println();
			}
			return;
		}
		
		//place the queen at every square in current row r and recurde for each valid move
		for(int i = 0;i<N;i++){
			//if no 2 queens threaten each other
			if(isSafe(mat, r, i)){
				mat[r][i] ='Q';
				//recurse for the next row
				nQueen(mat, r+1);
				//backtrack and remove the queen fromt he current square
				mat[r][i] = '-';
			}
		}
	}
	
	public static void main(String[] args) {
		char[][] mat = new char[N][N];
		for(int i = 0;i<N;i++){
			Arrays.fill(mat[i], '-');
		}
		nQueen(mat, 0);
	}

}
