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
    public  static int sum=0;
    public static TreeNode transform(TreeNode root){
         if(root==null){
            return null;
         }
       transform(root.right);
    sum+=root.val;
    root.val=sum;
    transform(root.left);
    return root;
    }
    public TreeNode bstToGst(TreeNode root) {
        sum=0;

        return transform(root);
        
    }
}