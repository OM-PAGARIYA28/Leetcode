class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int sum=0;
        while(total>=numExchange){
        sum+=numBottles;
        int empty=total%numExchange;
        numBottles=total/numExchange;
        total=empty+numBottles;
        }
        return sum+numBottles;
    }
}