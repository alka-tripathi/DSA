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
    public static int height(TreeNode root){
        if(root==null) return 0;
        int leftH=height(root.left);
         int rightH=height(root.right);
         return Math.max(leftH,rightH)+1;

    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        boolean l=isBalanced(root.left);
        boolean r=isBalanced(root.right);
         
        int leftside=height(root.left);
        int rightside=height(root.right);

        if(Math.abs(leftside-rightside)>1) return false;

        return l && r;
        

    }
}