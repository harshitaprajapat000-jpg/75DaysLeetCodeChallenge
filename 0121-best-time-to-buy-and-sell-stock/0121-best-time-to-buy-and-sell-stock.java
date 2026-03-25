class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0];
       int profit=0;
       int maxprofit=0;
       for(int i=0;i<prices.length;i++){
        int current=prices[i];
        if(min>current)
        min=current;
        else
        {
            profit=current-min;
            maxprofit=Math.max(maxprofit,profit);
        }
       }
       return maxprofit;
}
}