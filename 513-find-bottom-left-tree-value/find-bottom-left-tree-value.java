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
     public static List<List<Integer>> level(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                result.add(new ArrayList<>(list));
                list.clear();
                
                if(!q.isEmpty()){
                     q.add(null);
                }
            }else{
                 list.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return result;
     }

    public int findBottomLeftValue(TreeNode root) {
       
        if(root==null) return 0;
                List<List<Integer>> result=level(root);

                int n=result.size();
                List<Integer> a=result.get(n-1);
                int last=a.get(0);

               
           return last; 
        
    }
}