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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
         Swap(root);
         return root;
    }
    public void Swap(TreeNode root){
     if(root==null)return;
     if(root.left==null && root.right==null)return;
     if(root.left==null){
        root.left=root.right;
        root.right=null;
     }
     else if(root.right==null){
        root.right=root.left;
        root.left=null;
     }
    else{
        TreeNode node=root.left;
        root.left=root.right;
        root.right=node;
    }
    Swap(root.left);
    Swap(root.right);
    }
}