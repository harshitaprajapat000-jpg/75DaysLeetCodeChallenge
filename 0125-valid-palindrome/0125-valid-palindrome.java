class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n=s.length();
        String str=new String();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0' && s.charAt(i)<='9'))
            str+=s.charAt(i);
        }
        for(int j=0;j<str.length()/2;j++)
        {
            if(str.charAt(j)!=str.charAt(str.length()-j-1))
            return false;
        }
        return true;
    }
}