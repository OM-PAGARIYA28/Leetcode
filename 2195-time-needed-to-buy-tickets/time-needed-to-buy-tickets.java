class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        for(int i=0;i<tickets.length;i++){
            if(tickets[i]>=tickets[k]){
                count+=tickets[k];
            if(i>k){
                count--;
            }
            }
            else{
                count+=tickets[i];
            }
        }
        return count;
    }
}