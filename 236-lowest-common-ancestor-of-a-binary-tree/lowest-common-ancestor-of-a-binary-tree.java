/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static TreeNode solution(TreeNode root, TreeNode p, TreeNode q){
        if(root==null)return null;
        if(root==p || root==q){
            return root;
        }
        TreeNode leftside=solution(root.left,p,q);
        TreeNode rightside=solution(root.right,p,q);

       if(leftside!=null && rightside!=null){
        return root;
       }
       return leftside==null?rightside:leftside;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return solution(root,p,q);
        
    }
}