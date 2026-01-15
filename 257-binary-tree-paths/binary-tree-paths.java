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
    public static void  dfs(TreeNode root,List<String> ans,String path){
    
      path+=root.val;
        if(root.left==null && root.right==null){
           ans.add(path);
           return;
        }
        path+="->";
      if(root.left!=null){
          dfs(root.left,ans,path);
      }
      if(root.right!=null){
          dfs(root.right,ans,path);
      }
     
    }
    public List<String> binaryTreePaths(TreeNode root) {
          List<String> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
    
         dfs(root,ans,"");
         return ans;

        
    }
}