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
    //level order storing sum of the nodes
    public static ArrayList<Integer> levelSum(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum=0;
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                ans.add(sum);
                sum=0;
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                sum+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                 if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return ans;

    }
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
         ArrayList<Integer> ans = levelSum(root);
         int idx=0;
         int maxe=ans.get(0);
         for(int i=0;i<ans.size();i++){
            if(i!=idx && ans.get(i)>maxe){
                idx=i;
                maxe=ans.get(i);
            }

         }
         return idx+1;
    }
}