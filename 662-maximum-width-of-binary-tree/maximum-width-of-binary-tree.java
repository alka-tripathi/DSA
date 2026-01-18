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
    public static class Pair{
        TreeNode node;
        int idx;
        public Pair(TreeNode node,int idx){
            this.node=node;
            this.idx=idx;
        }
    }
    public static int solution(TreeNode root){
         if (root == null) return 0;
     Deque<Pair> dq = new ArrayDeque<>();
        int maxwidth=0;
        dq.add(new Pair(root,0));   //parent node and its index;
        while(!dq.isEmpty()){
            int currsize=dq.size();

            int start=dq.peekFirst().idx;
            int last=dq.peekLast().idx;
            maxwidth=Math.max(maxwidth,last-start+1);
            for(int i=0;i<currsize;i++){
              
             Pair curr = dq.removeFirst();
               TreeNode currnode = curr.node;
                int idx = curr.idx;
                if(currnode.left!=null){
                    dq.addLast(new Pair(currnode.left,2*idx+1));
                }
                 if(currnode.right !=null){
                    dq.addLast(new Pair(currnode.right,2*idx+2));
                }
            }

            
        }
        return maxwidth;

    }
    public int widthOfBinaryTree(TreeNode root) {
        //we can do it with CBT index bases
        return solution(root);
        
    }
}