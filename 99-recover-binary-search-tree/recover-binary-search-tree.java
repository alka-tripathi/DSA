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
    public static int idx=0;
    public static void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null)return ;
          inorder(root.left,arr);
          arr.add(root.val);
          inorder(root.right,arr);

    }
    public static void test(TreeNode root,ArrayList<Integer> arr){
        if(root==null)return ;
        test(root.left,arr);
        //set karo val of arr to tree
        root.val=arr.get(idx++);
        test(root.right,arr);

    }
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        Collections.sort(list);
idx=0;
        test(root,list);
        
    }
}