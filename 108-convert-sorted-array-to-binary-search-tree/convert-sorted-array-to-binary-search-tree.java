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
    public static TreeNode buildBST(int arr[],int l,int r){
        if(l>r) return null;
        int mid=l+(r-l)/2;
        TreeNode newnode=new TreeNode(arr[mid]);
        newnode.left=buildBST(arr,l,mid-1);
        newnode.right=buildBST(arr,mid+1,r);
        return newnode;


    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
      return buildBST(nums,0,nums.length-1);
        
    }
}