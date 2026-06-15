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
    public static TreeNode solution(TreeNode root,int val){
         TreeNode newnode = new TreeNode(val);
         if (root == null) {
            return newnode;
        }

      
      TreeNode temp=root;
      TreeNode prev=null;
      while(temp!=null){
         prev=temp;
        if(temp.val<val){
         
         temp=temp.right;
        }else{
            temp=temp.left;
        }
       
      }

      if(prev.val < val){
        prev.right=newnode;
      }else{
        prev.left=newnode;
      }
     
     return root;

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {

        return solution(root,val);
        
    }
}