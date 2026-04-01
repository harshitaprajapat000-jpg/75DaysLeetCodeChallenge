class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
         int a=0;
         int b=0;
      for(int i=0;i<tokens.length;i++){
            switch(tokens[i]){
                case "+":{
                    b=st.pop();
                    a=st.pop();
                    st.push(a+b);
                    break;
                }
                case "*":{
                    b=st.pop();
                    a=st.pop();
                    st.push(a*b);
                    break;
                }
                case "-":{
                    b=st.pop();
                    a=st.pop();
                    st.push(a-b);
                    break;
                }
                case "/":{
                    b=st.pop();
                    a=st.pop();
                    st.push(a/b);
                    break;
                }
                default:
                  st.push(Integer.parseInt(tokens[i]));
            }

          
        
      }
      return st.peek();

    }
}
//         int a=0;
//         int b=0;
//         for(String s:tokens){
//             int flag=0;
//                 switch(s)
//                 {
//                     case "+":
//                     {
//                       a=st.pop();
//                       b=st.pop();
//                       st.push(a+b);
//                        break;
//                      }
//                       case "-":
//                       {
//                          a=st.pop();
//                           b=st.pop();
//                          st.push(b-a);
//                     break;
//                      }
//                       case "/":
//                     {
//                          a=st.pop();
//                      b=st.pop();
//                     st.push(b/a);
//                     break;
//                      }
//                       case "*":
//                     {
//                      a=st.pop();
//                      b=st.pop();
//                     st.push(a*b);
//                     break;
//                      }
//                      default:
//                      flag=1;
//                             }
//                 if(flag==1)
//                 st.push(Integer.parseInt(s));
//                  }
        
//         return st.pop();
//     }
// }