class Solution {
    public int[] evenOddBit(int n) {
        int a[]=new int[2];
        int posn=0;
        while(n!=0){
            int m=n%2;
            if(m==1){
                if(posn%2==0){
                    a[0]++;
                }
                else{
                    a[1]++;
                }
            }
            posn++;
            n=n/2;
        }
        return a;
    }
}