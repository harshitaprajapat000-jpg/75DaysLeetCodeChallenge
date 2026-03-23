class Solution {
    public int minDistance(String word1, String word2) {
        int[][]dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++)
        Arrays.fill(dp[i],-1);
        int len=Distance(word1,word2,word1.length()-1,word2.length()-1,dp);
        return word1.length()+word2.length()-2*len;
    }
    public int Distance(String word1,String word2,int i,int j,int[][]dp){
        if(i<0 ||j<0)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j))
        return dp[i][j]=1+Distance(word1,word2,i-1,j-1,dp);
        return dp[i][j]=Math.max(Distance(word1,word2,i-1,j,dp),Distance(word1,word2,i,j-1,dp));
    }
}