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
    public static List<List<Integer>> solution(TreeNode root){
        List<List<Integer>> res= new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)return res;
        q.add(root);
        while(!q.isEmpty()){
           
            ArrayList<Integer> list = new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                 TreeNode curr = q.poll();
                 list.add(curr.val);
                 if(curr.left!=null)q.add(curr.left);
                 if(curr.right!=null) q.add(curr.right);

            }
            res.add(list);
        }
        return res;
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans= solution(root);
        Collections.reverse(ans);
        return ans;
        
    }
}