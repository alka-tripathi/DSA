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
   static  int max_sum;
    public static int solve(TreeNode root){

        if(root==null)return 0;

        int ls=Math.max(0,solve(root.left));
        int rs=Math.max(0,solve(root.right));

        int neeche_mill_gya=ls+rs+root.val;
        int dono_side=Math.max(ls,rs)+root.val;
        int root_aacha=root.val;
         max_sum = Math.max(max_sum,
                           Math.max(neeche_mill_gya,
                                    Math.max(dono_side, root_aacha)));
return Math.max(dono_side,root_aacha);


    }
    public int maxPathSum(TreeNode root) {

        max_sum=Integer.MIN_VALUE;
        solve(root);
        return max_sum;
        
    }
}