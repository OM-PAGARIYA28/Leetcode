/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2= headB;
        int skipA=0;
        int skipB=0;
        while(temp1 !=null){
            skipA++;
            temp1=temp1.next;
            
        }
        while(temp2!=null){
            skipB++;
            temp2=temp2.next;
        }
        while(skipA>skipB){
            skipA--;
            headA=headA.next;
        }
        while(skipB>skipA){
            skipB--;
            headB=headB.next;
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}