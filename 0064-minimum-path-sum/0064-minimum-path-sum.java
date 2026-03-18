class Solution {
    public int minPathSum(int[][] grid) {
        int[][]dp=new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int left=Integer.MAX_VALUE;
                int right=Integer.MAX_VALUE;
                if(i==0 && j==0)
                dp[i][j]=grid[i][j];
                else{
                if(i>0) left=grid[i][j]+dp[i-1][j];
                if(j>0) right=grid[i][j]+dp[i][j-1];
                dp[i][j]=Math.min(left,right); 
            }
            }
        }
      return dp[grid.length-1][grid[0].length-1];
    }
}
//     public int fun(int[][]grid,int[][]dp,int i,int j){
//         if(i==0 && j==0)
//         return grid[0][0];
//         if(i<0 || j<0)
//         return Integer.MAX_VALUE;
//         if(dp[i][j]!=0)
//         return dp[i][j];
//         return dp[i][j]=grid[i][j]+Math.min(fun(grid,dp,i-1,j),fun(grid,dp,i,j-1));
//     }
// }