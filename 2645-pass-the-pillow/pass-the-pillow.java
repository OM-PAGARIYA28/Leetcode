class Solution {
    public int passThePillow(int n, int time) {
        int full=(n-1)*2;
        int time_rem=time%full;
        if(time_rem<n){
            return 1 + time_rem;
        } else {
            return n - (time_rem - (n - 1)); 
        }
    }
}