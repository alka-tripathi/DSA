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
     TreeNode prev = null;
    TreeNode first = null;
    TreeNode sec = null;

    public void solution(TreeNode root){
        if(root==null)return ;
       solution(root.left);
       if(prev!=null && root.val <prev.val){
        if(first==null){
            first=prev;
        }
        sec=root;
       }
       prev=root;

       solution(root.right);
    }
    public void recoverTree(TreeNode root) {
        

        solution(root);
        //swap the val
        int temp=first.val;
        first.val=sec.val;
        sec.val=temp;
        
    }
}