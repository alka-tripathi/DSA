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
    public static boolean solution(TreeNode root,int targetSum,int sum){
        if(root==null) return false;
        sum+=root.val;
        if((root.left==null && root.right==null)&& (targetSum==sum)){
           return true;
            
        }
  
        boolean leftS=solution(root.left,targetSum,sum);
        
        boolean rightS= solution(root.right,targetSum,sum);

        return (leftS || rightS);
   
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
int sum=0;
        return solution(root,targetSum,sum);
        
    }
}