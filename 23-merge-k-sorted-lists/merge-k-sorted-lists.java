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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq= new PriorityQueue<>((a,b)-> a.val-b.val);
        int n=lists.length;
        for(int i=0;i<n;i++){
          
            ListNode temp= lists[i];
            while(temp!=null){
                pq.add(temp);
                temp=temp.next;
            }
            

        }
        ListNode head = new ListNode();
        ListNode temp=head;
       while(temp!=null){
        ListNode ans = pq.poll();
        temp.next=ans;
        temp=temp.next;
     }
         return head.next;
    }
}