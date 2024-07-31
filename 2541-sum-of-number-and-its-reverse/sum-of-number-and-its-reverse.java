class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for (int n = 0; n <= num; n++) {
            if (n + reverse(n) == num) {
                return true;
            }
        }
        return false;
    }

    int reverse(int n){
        int rev=0;
        int sum=0;
        while(n!=0){
            rev=n%10;
            sum=sum*10+rev;
            n=n/10; 
        }
        return sum;
    }
}