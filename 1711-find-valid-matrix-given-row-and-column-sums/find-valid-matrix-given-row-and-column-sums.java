class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int row=rowSum.length;
        int col=colSum.length;
        int mtx[][]=new int[row][col];
        int i=0,j=0;
        while(i<row && j<col){
            int val=Math.min(rowSum[i],colSum[j]);
            mtx[i][j]=val;
            rowSum[i]-=val;
            colSum[j]-=val;

            if(rowSum[i]==0){
                i++;
            }
            if(colSum[j]==0){
                j++;
            }
        }
        return mtx;
    }
}