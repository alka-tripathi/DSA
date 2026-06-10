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
    public static void solution(TreeNode root,List<Integer> ans){
        if(root==null)return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
             TreeNode curr=q.poll();
             list.add(curr.val);
             if(curr.left!=null){
                q.add(curr.left);
             }
             if(curr.right!=null){
                q.add(curr.right);
             }
            }
            ans.add(list.get(list.size()-1));
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        solution(root,ans);
        return ans;
        
    }
}