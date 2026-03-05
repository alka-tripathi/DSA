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
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for(int i=0;i<lists.length;i++){
            if(lists[i] !=null){
                pq.offer(lists[i]);
            }
        }
        ListNode result=new ListNode(-1);
        ListNode temp=result;
        while(!pq.isEmpty()){
            ListNode smallestNode = pq.poll();
            temp.next=smallestNode;
            temp=temp.next;
            if(smallestNode.next!=null){
                pq.offer(smallestNode.next);
            }
        }
        return result.next;
        
    }
}