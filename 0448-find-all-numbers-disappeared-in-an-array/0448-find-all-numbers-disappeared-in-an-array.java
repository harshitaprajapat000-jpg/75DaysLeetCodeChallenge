class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int i=0;
       while(i<nums.length){
        int curr=nums[i];
        if(nums[i]!=nums[curr-1]){
        int temp=nums[i];
        nums[i]=nums[curr-1];
        nums[curr-1]=temp;
        }else
        i++;
       }
       for(int j=1;j<=nums.length;j++){
        if(nums[j-1]!=j)
        list.add(j);
       }
        return list;
    }
}