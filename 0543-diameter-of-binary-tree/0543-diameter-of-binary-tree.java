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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        MaxHeight(root);
        return max;
    }
    public int MaxHeight(TreeNode root){
        if(root==null)
        return 0;
        int lh=MaxHeight(root.left);
        int rh=MaxHeight(root.right);
        max=Math.max(max,lh+rh);
        return 1+Math.max(lh,rh);
    }
    }