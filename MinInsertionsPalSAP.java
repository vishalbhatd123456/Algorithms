class Solution {
    public int minInsertions(String s) {
        String rs=reverse(s);
        int len=LCS(s,rs);
        return s.length()-len;
    }
    public String reverse(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
            sb.append(s.charAt(i));
        return sb.toString();
    }
    public int LCS(String a,String b){
        int n=a.length();
        int m=b.length();
        if(n==0||m==0)
            return 0;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
            }
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(a.charAt(i-1)==b.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}
