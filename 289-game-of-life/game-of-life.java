class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                if(i+1<m && board[i+1][j]==1) sum++;
                if(i-1>=0 && board[i-1][j]==1) sum++;
                if(j+1<n && board[i][j+1]==1) sum++;
                if(j-1>=0 && board[i][j-1]==1) sum++;
                if(i+1<m && j+1<n && board[i+1][j+1]==1)sum++;
                if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1)sum++;
                if(i+1<m && j-1>=0 && board[i+1][j-1]==1)sum++;
                if(i-1>=0 && j+1<n && board[i-1][j+1]==1)sum++;

                if((board[i][j]==0 && sum==3) || (board[i][j]==1 && (sum==3 || sum ==2))) arr[i][j]=1;
                else arr[i][j]=0;
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=arr[i][j];
            }
        }
    }
}