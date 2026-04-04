/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        // Iteration //
        Stack<TreeNode> st=new Stack<>();
        if(root==null)
        return list;
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node=st.pop();
            if(node.right!=null)st.push(node.right);
             if(node.left!=null)st.push(node.left);
           list.add(node.val);
        }
      return list;
    }
}
//   Recursion   //

//          Traverse(root,list);
//          return list;
//     }
//     public void Traverse(TreeNode root,List<Integer> list){
//         if(root==null)
//         return ;
//         list.add(root.val);
//         Traverse(root.left,list);
//         Traverse(root.right,list);
//     }
// }