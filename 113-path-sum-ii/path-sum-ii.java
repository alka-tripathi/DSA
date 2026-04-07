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
    public static void solution(TreeNode root,List<Integer>list,List<List<Integer>>  result){
  if(root==null)return;
  list.add(root.val);
  if(root.left==null && root.right==null){
    result.add(new ArrayList<>(list));
     list.remove(list.size()-1);
     return;
  }
        
        solution(root.left,list,result);
        solution(root.right,list,result);
        list.remove(list.size()-1);
        return;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
List<List<Integer>>  result = new ArrayList<>();
List<List<Integer>>  result1 = new ArrayList<>();
List<Integer> list = new ArrayList<>();
solution(root,list,result);

for(int i=0;i<result.size();i++){
    List<Integer> l=result.get(i);
    int sum=0;
    for(int j=0;j<l.size();j++){
        sum+=l.get(j);
    }
    if(sum==targetSum){
        result1.add(l);
    }
}
return result1;

    
        
    }
}