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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode reverse= reverse(slow);

        while(reverse!=null){
            if(head.val != reverse.val){
                return false;
            }
            head=head.next;
            reverse=reverse.next;
        }
            return true;
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