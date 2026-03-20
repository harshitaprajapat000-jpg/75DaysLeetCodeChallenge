class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][]dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++)
        Arrays.fill(dp[i],-1);
        int ans=Fun(coins,coins.length-1,amount,dp);
        return ans==(int)1e9?-1:ans;
    }
    public int Fun(int[] coins,int idx,int amount,int[][]dp){
         if(idx==0){
            if(amount % coins[idx]==0) return amount/coins[idx];
            if(amount==0) return 0;
            return (int)1e9;
         }
        if(dp[idx][amount]!=-1)
        return dp[idx][amount];
        int take=(int) 1e9;
       if(coins[idx]<=amount)
        take=1+Fun(coins,idx,amount-coins[idx],dp);
        int not=Fun(coins,idx-1,amount,dp);
        return dp[idx][amount]=Math.min(not,take);
   
    }
}