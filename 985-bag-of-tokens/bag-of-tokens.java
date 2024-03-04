class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int count=0;
        int left=0;
        int max=0;
        int right=tokens.length-1;
        while(left<=right){
            if(tokens[left]<=power){
                power-=tokens[left];
                count++;
                left++;
                max = Math.max(max, count);
            }
            else if(count>=1 ){
                power+=tokens[right];
                count--;
                right--;
                 
            }
            else{
                break;
            }
        }
        return max;
    }
}