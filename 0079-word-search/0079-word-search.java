class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] visited=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if( Recursion(board,word,i,j,0,visited))
                return true;
            }
        }
        return false;
    }
    public boolean Recursion(char[][]board,String word,int i,int j,int idx,int[][]visit){
       if(idx==word.length())
         return true;
         if(i<0 ||j<0 ||i==board.length||j==board[0].length||visit[i][j]==1||word.charAt(idx)!=board[i][j] )
         return false;
            visit[i][j]=1;
            boolean down=Recursion(board,word,i+1,j,idx+1,visit);
            boolean right=Recursion(board,word,i,j+1,idx+1,visit);
            boolean up=Recursion(board,word,i-1,j,idx+1,visit);
            boolean left=Recursion(board,word,i,j-1,idx+1,visit);
             visit[i][j]=0;
             return down||right||up||left;
         
    }
}