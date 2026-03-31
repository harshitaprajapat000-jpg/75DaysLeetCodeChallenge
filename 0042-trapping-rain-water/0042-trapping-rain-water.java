class Solution {
    public int trap(int[] height) {
       int right=0;
       int left=height.length-1;
       int rmax=0;
       int lmax=0;
       int total=0;
       while(right<left){
        if(height[right]<=height[left]){
            if(height[right]<rmax)
            total+=rmax-height[right];
            else
            rmax=height[right];
            right++;
        }else
        {
            if(height[left]<height[right]){
            if(height[left]<lmax)
            total+=lmax-height[left];
            else
            lmax=height[left];
            left--;
        }
       }
       }
       return total;

    }
}