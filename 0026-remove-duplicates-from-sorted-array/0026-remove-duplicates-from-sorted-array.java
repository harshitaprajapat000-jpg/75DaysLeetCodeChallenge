class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
        int idx=0;
        for(int i=1;i<nums.length;i++){
            if(arr[idx]!=nums[i])
            {
                idx++;
                arr[idx]=nums[i];
            }
        }
        for(int i=0;i<=idx;i++)
            nums[i]=arr[i];
        
        return idx+1;
    }
}