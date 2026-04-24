class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cl=0;
        int cr=0;
        int move=0;
      for(char c:moves.toCharArray()){
        if(c=='L')
        cl++;
        if(c=='R')
        cr++;
      }
      for(char c:moves.toCharArray()){
        if(c=='L')
        move--;
        if(c=='R')
        move++;
        if(c=='_'){
            if(cl>cr)
            move--;
            else 
            move++;
        }
      }
        return Math.abs(move);
    }
}