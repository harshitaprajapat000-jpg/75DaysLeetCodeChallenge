class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String words:strs){
            char[] news=words.toCharArray();
            Arrays.sort(news);
            String s=new String(news);
            if(!map.containsKey(s))
            map.put(s,new ArrayList<>());
            map.get(s).add(words);
        }
        List<List<String>> Biglist=new ArrayList<>();
        for(List<String> list:map.values())
        Biglist.add(list);
        
        return Biglist;
        
    }
}