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
    int val=0;
    int res=0;
    public int kthSmallest(TreeNode root, int k) {
         val=k;
          Small(root);
        return res;
    }
    public void Small(TreeNode root){
        if(root==null)return ;
        Small(root.left);
         if(--val==0){
            res=root.val;
            return;
         }
        Small(root.right);
    }
}