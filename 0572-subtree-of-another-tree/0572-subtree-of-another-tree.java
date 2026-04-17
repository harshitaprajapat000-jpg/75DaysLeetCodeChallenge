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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return Check(root,subRoot);
    }
    public boolean Check(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null)return true;
        if(root==null || subRoot==null)return false;
        boolean val1=false;
        if(root.val==subRoot.val)
        if(isRight(root,subRoot))return true;
        return Check(root.left,subRoot)||Check(root.right,subRoot);
    }
    public boolean isRight(TreeNode root,TreeNode subRoot){
        if(subRoot==null && root==null)return true;
        if(subRoot==null||root==null)return false;
        if(root.val!=subRoot.val)return false;
        return isRight(root.left,subRoot.left)&&isRight(root.right,subRoot.right);
    }
}