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
    public static void solution(TreeNode root,  ArrayList<Integer>  ans){
        if(root==null)return;
        solution(root.left,ans);
        ans.add(root.val);
        solution(root.right,ans);
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        solution(root,ans);
        int minans=Integer.MAX_VALUE;
        for(int i=1;i<ans.size();i++){
            minans=Math.min(minans,Math.abs(ans.get(i-1)-ans.get(i)));

        }
        return minans;
        
    }
}