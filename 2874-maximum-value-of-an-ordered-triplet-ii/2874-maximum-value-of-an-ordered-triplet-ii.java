class Solution {
    public long maximumTripletValue(int[] nums){
       long total=0;
       int[] prefimax=new int[nums.length];
       int[] suffixmax=new int[nums.length];
       int n=nums.length;
       prefimax[0]=nums[0];
       suffixmax[nums.length-1]=nums[nums.length-1];
       for(int i=1;i<nums.length;i++)
        prefimax[i]=Math.max(nums[i],prefimax[i-1]);
       for(int i=nums.length-2;i>=0;i--)
       suffixmax[i]=Math.max(suffixmax[i+1],nums[i]);
       for(int i=1;i<nums.length-1;i++)
       total=Math.max(total,(long)(prefimax[i-1]-nums[i])*suffixmax[i+1]);
       return total;

    }
}