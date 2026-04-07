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
    public static void solution(TreeNode root,List<String> ans,String str){
      
       
            if(root==null)return;
               str+=root.val;
        if(root.left==null && root.right==null){
            ans.add(str);
            return;

        }
        

     str+="->";
    
        solution(root.left,ans,str);
      
      
        solution(root.right,ans,str);
      
     return;

    }
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans= new ArrayList<>();
        StringBuilder str = new StringBuilder();
        solution(root,ans,"");
        return ans;
        
    }
}