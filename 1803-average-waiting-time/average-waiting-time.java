class Solution {
    public double averageWaitingTime(int[][] customers) {
        int initial=0;
        int end=0;
        double wt=0;
        for(int i=0;i<customers.length;i++){
            if(end>=customers[i][0]){
            initial=end;}
            else{
                initial=customers[i][0];
            }
            end=initial+customers[i][1];
            wt+=end-customers[i][0];
        }
        return wt/customers.length;
    }
}