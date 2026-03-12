class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                arr[0]=map.get(target-nums[i]);
                arr[1]=i;
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}