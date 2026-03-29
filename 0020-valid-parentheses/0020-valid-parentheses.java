class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
      char[] arr=s.toCharArray();
      for(char c:arr){
      if(c=='('||c=='{'||c=='[')
      st.push(c);
      else{
      if(st.isEmpty())
      return false;
      char top=st.peek();
      if((top=='(' && c!=')') || (top=='['&& c!=']') || (top=='{'&& c !='}'))
      return false;
      else
      st.pop();
    }
      }
      if(st.isEmpty())
      return true;
      return false;
    }
}