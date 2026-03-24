class Solution {
    public int maxArea(int[] height) {
        int l=height.length-1;
        int r=0;
        int max=0;
        while(r<l){
         if(height[r]<height[l]){
          max=Math.max((l-r)*height[r],max);
          r++;
         }else{
              max=Math.max((l-r)*height[l],max);
              l--;
         }
        }
        return max;
    }
}