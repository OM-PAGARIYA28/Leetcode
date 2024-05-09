import java.util.*;
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int count=0;
        long max=0;
        // if(k==1) return happiness[happiness.length-1];
           for(int i=happiness.length-1;i>=0;i--){
            if(happiness[i]-count>0 && k>0){
             max+=happiness[i]-count;
            }
            // else{
            //     max+=0;
            // }
            count++;
            k--;
           } 
        return max;
    }
}