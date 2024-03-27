class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a=0,b=0;
        int sum=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                a++;
                sum+=5;
            }
            else if(bills[i]==10 && sum>=5){
                b++;
                a--;
                sum+=5;
            }
            else if(bills[i]==20 && sum>=15){
                 if(b>=1 && a>=1){
                    b--;
                    a--;
                    sum+=5;
                }
                else if(a>=3){
                    a-=3;
                    sum+=5;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}