class Solution {
    public boolean checkValidString(String s) {
        int[][][]dp=new int[s.length()][s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++)
            Arrays.fill(dp[i][j],-1);
        }
        return Validation(s,0,0,0,dp)>=1?true:false;
    }
    public int Validation(String s,int open,int close,int idx,int[][][]dp){
         if(close>open)
        return 0;
        if(idx==s.length()){
            if(open==close)
            return 1;
            return 0;
        }
       if(dp[idx][open][close]!=-1)
       return dp[idx][open][close];
         
        if(s.charAt(idx)=='(')
        dp[idx][open][close]=Validation(s,open+1,close,idx+1,dp);
 
          
        if(s.charAt(idx)==')')
              dp[idx][open][close]=Validation(s,open,close+1,idx+1,dp);
   
          if(s.charAt(idx)=='*')
        dp[idx][open][close]=Validation(s,open+1,close,idx+1,dp)+Validation(s,open,close+1,idx+1,dp)+Validation(s,open,close,idx+1,dp);
        

        return dp[idx][open][close];
        
    }
}