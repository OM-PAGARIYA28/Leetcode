class Solution {
    public boolean sumDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum%2==0;
    }
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++){
            if(sumDigits(i)){
                count++;
            }
        }
        return count;
    }
}