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
    public ListNode mergeNodes(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode node=new ListNode(0);
        ListNode ans=node;
        ListNode current=head.next;
        int sum=0;
        while(current!=null){
        if(current.val!=0){
            sum+=current.val;
        }
        else{
            ans.next=new ListNode(sum);
            ans=ans.next;
            sum=0;
        }
        current=current.next;
        }
        return node.next;
        }
}