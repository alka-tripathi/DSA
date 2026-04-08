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
    public static void solution(TreeNode root,List<List<Integer>> res){
        Queue<TreeNode> q = new LinkedList<>();
        boolean lr=true;
        if(root==null)return;
        q.add(root);

        while(!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size=q.size();
          
            for(int i=0;i<size;i++){
              TreeNode curr=q.poll();
              list.add(curr.val);
              if(curr.left!=null)q.add(curr.left);
              if(curr.right!=null)q.add(curr.right);
            }
            if(lr){
                res.add(list);
                lr=false;
            }else{
                Collections.reverse(list);
                res.add(list);
                lr=true;

            }
        }
       
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        solution(root,res);
        return res;
        
    }
}