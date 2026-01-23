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
    public static void zigzagTraversal(TreeNode root,List<List<Integer>> ans,int flag){
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode currnode=q.remove();
            if(currnode==null){
              if(flag==1){
                 ans.add(new ArrayList<>(list));
              }else{
              Collections.reverse(list);
                 ans.add(new ArrayList<>(list));
              }
               list.clear();
               flag=1-flag;
              
               if(!q.isEmpty()){
                 q.add(null);
               }
            }
        else{
             list.add(currnode.val);
                  if(currnode.left!=null){
                    q.add(currnode.left);
                } 
                if(currnode.right!=null){
                    q.add(currnode.right);
                }
                
                
                
            }
            }
          
        }
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int flag=1;
           List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return  ans;
    
       zigzagTraversal(root,ans,flag);
       return ans;
        
    }
}