class Solution {
    public String sortVowels(String s) {
        List<Integer> listC=new ArrayList<>();
        List<Integer> listS=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            listS.add(c-'a');
             if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
             listC.add(c-'A');
        }
        Collections.sort(listC);
        Collections.sort(listS);
        int idx1=0;
        int idx2=0;
        StringBuilder sb=new StringBuilder();
         for(char c:s.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            if(idx1<listC.size())
             sb.append((char)(listC.get(idx1++)+'A'));
             else
             sb.append((char)(listS.get(idx2++)+'a'));
            }
             else
             sb.append(c);
        }
        return sb.toString();
    }
}