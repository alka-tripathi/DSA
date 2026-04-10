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
        if(root==null)return 1;
         int lh=height(root.left);
         int rh=height(root.right);

         return Math.max(lh,rh)+1;
    }
    public static int solution(TreeNode root){
        if(root==null)return 0;

        int leftH=height(root.left);
        int rightH=height(root.right);
        int maxi=Math.max(leftH,rightH);

       int lh=solution(root.left);
       int rh=solution(root.right);
       return Math.max(maxi,Math.max(lh,rh));
    }
    public int maxDepth(TreeNode root) {
        return solution(root);
        
    }
}