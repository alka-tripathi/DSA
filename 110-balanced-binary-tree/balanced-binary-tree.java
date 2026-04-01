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
        
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static boolean solution(TreeNode root){
        
        int lh=height(root.left);
        int rh=height(root.right);

        return Math.abs(lh-rh)<=1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        if(solution(root)==false)return false;

        boolean leftsubtree=isBalanced(root.left);
        boolean rightSubstree=isBalanced(root.right);

        return leftsubtree && rightSubstree;

      
        
    }
}