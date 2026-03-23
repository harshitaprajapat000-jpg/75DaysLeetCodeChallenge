class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> Biglist=new ArrayList<>();
           Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if((long)(nums[j]+nums[k])>0-nums[i])
                k--;
                else  if((long)(nums[j]+nums[k])<0-nums[i])
                j++;
                else if((long)(nums[k]+nums[j]+nums[i])==0)
                {
                     List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    Biglist.add(list);
                       j++;
                       k--;
                     while(j<k && nums[j]==nums[j-1])j++;
                    while(k>j && nums[k]==nums[k+1])k--;
                    
                }
            }
           
        }
        return Biglist;
    }
}