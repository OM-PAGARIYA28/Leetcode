class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               int num=matrix[i][j];
               int max=Integer.MIN_VALUE;
               int min=Integer.MAX_VALUE;
                for(int k=0; k<cols; k++) {
                    min = Math.min(min, matrix[i][k]);
                }
                for(int l=0; l<rows; l++) {
                    max = Math.max(max, matrix[l][j]);
                }
                if(num == min && num == max) {
                    result.add(num);

        }
        }
        }
        return result;
    }
}