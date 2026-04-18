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
    public static int minval=Integer.MAX_VALUE;
      public static TreeNode prev = null;
    public static void solution(TreeNode root){

        if(root==null)return ;
        solution(root.left);
        if(prev!=null){
           int  mini=Math.abs(root.val-prev.val);
           minval=Math.min(mini,minval);
        }
        prev=root;
        solution(root.right);

    }
    public int getMinimumDifference(TreeNode root) {
      minval=Integer.MAX_VALUE;
      prev=null;
     solution(root);
     return minval;
        
    }
}