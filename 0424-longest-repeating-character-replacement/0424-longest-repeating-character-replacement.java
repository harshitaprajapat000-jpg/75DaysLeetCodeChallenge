class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxf=0;
        int maxlen=0;
        int right=0;
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<s.length()){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            maxf=Math.max(maxf,map.get(arr[right]));
            if((right-left+1)-maxf>k){
                maxf=0;
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0)
                map.remove(arr[left]);
                for(int val:map.values())
                maxf=Math.max(val,maxf);
                left++;
            }
            maxlen=Math.max(right-left+1,maxlen);
            right++;
        }
        return maxlen;
    }
}