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
    int count=0;
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null)
        return root;
        OddLevel(root.left,root.right,true);
        return root;
    }
  public void OddLevel(TreeNode left,TreeNode right,boolean flag){
    if(left==null && right==null)return;
    if(flag){
        int temp=left.val;
        left.val=right.val;
        right.val=temp;
    }
    flag=!flag;
    OddLevel(left.left,right.right,flag);
    OddLevel(left.right,right.left,flag);

  }
}