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
    public static class pair{
        TreeNode node;
        int index;
        public pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {

        Deque<pair> dq= new ArrayDeque<>();
        int maxans=0;

        dq.addLast(new pair(root,0));

        while(!dq.isEmpty()){
           int size = dq.size();

            int fi = dq.peekFirst().index;
            int li = dq.peekLast().index;
             maxans = Math.max(maxans, li - fi + 1);
           

            for(int i=0;i<size;i++){

               pair curr=dq.removeFirst();
             int idx=curr.index;


                if(curr.node.left != null){
                    pair newp=new pair(curr.node.left,2*idx+1);
                  dq.addLast(newp);
                }
                if(curr.node.right!=null){
                 pair newp1=new pair(curr.node.right,2*idx+2);
                  dq.addLast(newp1);
                }

            }

        }
        return maxans;

        
    }
}