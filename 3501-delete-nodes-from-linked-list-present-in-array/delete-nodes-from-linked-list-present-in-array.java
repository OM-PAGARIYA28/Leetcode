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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode prev = d;
        ListNode curr = head;

        while(curr!=null){
            if(s.contains(curr.val)){
                prev.next=curr.next;
            }
            else{
            prev=curr;
            }
            curr=curr.next;
        }
        return d.next;
    }
}