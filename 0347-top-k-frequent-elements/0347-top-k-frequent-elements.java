class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        for(int num:map.values())
        pq.add(num);
        int idx=0;
        int i=0;
        while(k!=idx)
        {
        
        if(pq.peek()==map.get(nums[i])){
        arr[idx++]=nums[i];
        pq.poll();
        map.remove(nums[i]);
        }
         i=(i+1)%nums.length;
        }
        return arr;
    }
}