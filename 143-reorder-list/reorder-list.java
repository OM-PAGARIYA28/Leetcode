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
    public void reorderList(ListNode head) {
        if(head == null){
            return ;
        }
        ListNode slow=head;
        ListNode fast =head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
         ListNode reverse= reverse(slow.next);
         slow.next=null;

        while(reverse!=null){
            ListNode front=head.next;
            ListNode back=reverse.next;
            head.next = reverse; 
            reverse.next=front;
            head = front;
            reverse=back;
        }
        }


    public ListNode reverse(ListNode head){
            ListNode prev=null;
            ListNode current=head;
            ListNode next;
            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            return prev;
        }
    }