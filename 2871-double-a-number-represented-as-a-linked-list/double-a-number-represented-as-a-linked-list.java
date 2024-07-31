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
    public ListNode doubleIt(ListNode head) {
       Stack<Integer> s1=new Stack<>();
       int carry=0;
       int val1=0;
       int val2=0;
       ListNode curr=null;
       while(head!=null){
        s1.add(head.val);
        head=head.next;
       }
       while(!s1.isEmpty() || carry!=0){
        if(s1.isEmpty()){
            val1=0;
            val2=val1;
        }
        else{
        val1=s1.pop();
        val2=val1;
        }
        int total=val1+val2+carry;
        carry=total/10;
       ListNode n=new ListNode(total%10);
       n.next=curr;
       curr=n;
       }
       return curr;
    }
}