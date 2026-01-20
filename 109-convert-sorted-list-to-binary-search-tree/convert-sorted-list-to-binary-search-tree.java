/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    //size of linkedList
    public static ListNode lastNode(ListNode head){
        ListNode temp=head;
        int s=0;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }
    //mid of linkedList
    public static ListNode midLL(ListNode head){
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(  fast!=null &&  fast.next!=null) {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null){
            prev.next=null;
        }
        return slow;
    }
    public static TreeNode buildBST(ListNode head){
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        
        ListNode mid=midLL(head);

        TreeNode root = new TreeNode(mid.val);

        root.left=buildBST(head);
        root.right=buildBST(mid.next);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
    
        return buildBST(head);
        
    }
}