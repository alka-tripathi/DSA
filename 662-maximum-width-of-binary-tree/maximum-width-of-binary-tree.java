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
    public static int maxans;
    public static class pair{
        TreeNode node;
        int idx;
        public pair(TreeNode node,int idx){
            this.node = node;
            this.idx=idx;
        }
    }
    public static void solution(TreeNode root){
        if(root==null)return ;
        Deque<pair> q = new ArrayDeque<>();
        q.addLast(new pair(root,0));


       
            
        while(!q.isEmpty()){
            int size=q.size();
          
              int f=q.peekFirst().idx;
            int l=q.peekLast().idx;
            maxans=Math.max(l-f+1,maxans);
           

          for(int i=0;i<size;i++){
            pair p = q.removeFirst();
                TreeNode node = p.node;
                int idx = p.idx;
              if(node.left!=null){
                q.addLast(new pair(node.left,2*idx+1));
            }
             if(node.right!=null){
                q.addLast(new pair(node.right,2*idx+2));
            }
          }
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
maxans=0;
         solution(root);
        return maxans;
    }
}