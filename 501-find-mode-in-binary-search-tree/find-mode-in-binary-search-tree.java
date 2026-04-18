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
    public static void inorder(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null)return ;
        
        inorder(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        inorder(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        inorder(root,map);
        int maxi=0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int k:map.keySet()){
            int val=map.get(k);
            if(val>maxi){
                ArrayList<Integer> list = new ArrayList<>();
                maxi=val;
                list.add(k);
                ans.clear();
                ans.addAll(list);
            
            }else if(val==maxi){
                maxi=val;
                ans.add(k);
            }

        }
           System.out.println(ans.size());
        int arr[]= new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
     
        return arr;
      

        
    }
}