class Solution {
    public int minDistance(String word1, String word2) {
       int[][]dp=new int[word1.length()][word2.length()];
       for(int i=0;i<word1.length();i++)
       Arrays.fill(dp[i],-1);
       return Distance(word1,word2,word1.length()-1,word2.length()-1,dp);
    }
    public int Distance(String s1,String s2,int i,int j,int[][]dp){
        if(i<0)
        return j+1;
        if(j<0)
        return i+1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        return dp[i][j]=Distance(s1,s2,i-1,j-1,dp);
        return dp[i][j]=1+Math.min(Distance(s1,s2,i-1,j-1,dp),Math.min(Distance(s1,s2,i-1,j,dp),Distance(s1,s2,i,j-1,dp)));
           }
}