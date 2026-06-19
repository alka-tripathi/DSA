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
    public static TreeNode sol(TreeNode root,int val){
        if(root==null)return null;

        TreeNode temp=root;
        while(temp!=null){
            if(temp.val==val)return temp;
            if(temp.val < val){
                return sol(root.right,val);
            }else{
                return sol(root.left,val);
            }
        }
        return null;
    }
    public TreeNode searchBST(TreeNode root, int val) {

        return sol(root,val);
        
    }
}