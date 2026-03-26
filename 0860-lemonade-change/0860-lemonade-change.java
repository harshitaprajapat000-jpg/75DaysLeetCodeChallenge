class Solution {
    public boolean lemonadeChange(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        if(nums[i]==10){
            if(!map.containsKey(5))
            return false;
            map.put(5,map.get(5)-1);
            if(map.get(5)==0)
            map.remove(5);
        }else if(nums[i]==20){
             if(!map.containsKey(5) || !map.containsKey(10) && map.get(5)<3)
            return false;
            if(map.containsKey(10)){
                 map.put(5,map.get(5)-1);
                  map.put(10,map.get(10)-1);
                  if(map.get(10)==0)
                  map.remove(10);
                  if(map.get(5)==0)
                  map.remove(5);
            } else if(!map.containsKey(10)){
                 map.put(5,map.get(5)-3);
               if(map.get(5)==0)
            map.remove(5);

            }
        }
        
    }
       
        return true;
    }
}