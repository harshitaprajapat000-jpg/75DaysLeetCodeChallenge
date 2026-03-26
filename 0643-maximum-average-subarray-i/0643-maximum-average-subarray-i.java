class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int right=0;
        int left=0;
        double sum=0;
        double av=0;
        while(right<k){
            sum+=nums[right];
            right++;
        }
        av=sum/k;
        while(right<nums.length){
            sum+=nums[right];
            sum-=nums[left];
            av=Math.max(av,sum/k);
            right++;
            left++;
        }
        return av;
    }
}