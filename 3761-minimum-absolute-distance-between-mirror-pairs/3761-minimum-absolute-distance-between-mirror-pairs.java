class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
         int val=Reverse(nums[i]);
         if(map.containsKey(val)){
         if(i<map.get(val)){  
         min=Math.min(min,map.get(val)-i);
         map.remove(nums[i]);
         }
         }
         map.put(nums[i],i);
         }
         min=min==Integer.MAX_VALUE?-1:min;
         return min;

    }
    public int Reverse(int val){
        int num=0;
        while(val>0){
            int rem=val%10;
            num=num*10+rem;
            val/=10;
        }
        return num;
    } 
}