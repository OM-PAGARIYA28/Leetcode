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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int count=1;
            if (head == null || k == 0) return head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        temp.next=head;
        int n=count-k%count;
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        ListNode newH=temp.next;
        temp.next=null;

        return newH;
    }
}