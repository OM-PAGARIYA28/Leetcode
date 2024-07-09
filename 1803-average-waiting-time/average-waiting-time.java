class Solution {
    public double averageWaitingTime(int[][] customers) {
        int initial=customers[0][0];
        int end=initial+customers[0][1];
        double wt=end-initial;
        for(int i=1;i<customers.length;i++){
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