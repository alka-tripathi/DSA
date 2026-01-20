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
    public static boolean isIdentical(TreeNode root, TreeNode subroot){
        if(root==null && subroot==null) return true;
        if(root==null || subroot==null || root.val!=subroot.val)return false;
        boolean leftidentical=isIdentical(root.left,subroot.left);
        boolean rightidentical=isIdentical(root.right,subroot.right);
        return leftidentical && rightidentical;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(root.val==subRoot.val){
        if(isIdentical(root,subRoot)){
            return true;
        }
        }

        boolean leftside=isSubtree(root.left,subRoot);
        boolean rightside=isSubtree(root.right,subRoot);
        return leftside || rightside;
        
    }
}