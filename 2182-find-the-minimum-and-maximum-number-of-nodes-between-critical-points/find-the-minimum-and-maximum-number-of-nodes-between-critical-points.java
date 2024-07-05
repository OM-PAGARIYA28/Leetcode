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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> points=new ArrayList<>();
        int i=2;
        int min_dist=Integer.MAX_VALUE;
        int prev_i=Integer.MIN_VALUE;
        int first_i=-1;
        ListNode prev=head;
        head=head.next;
        while(head.next!=null){
            if((prev.val<head.val && head.val>head.next.val) || (prev.val>head.val && head.val<head.next.val)){
                if(prev_i != Integer.MIN_VALUE){
                    min_dist=Math.min(min_dist,i-prev_i);
                }
                if(first_i==-1){
                    first_i=i;
                }
                prev_i=i;
            }
            prev=head;
            head=head.next;
            i++;
        }
        if(min_dist==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        return new int[] {min_dist,prev_i-first_i};
    }
}