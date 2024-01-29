class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] givenHeights = new int[heights.length];
        for (int i=0; i< heights.length; i++){
            givenHeights[i] = heights[i];
        }
        Arrays.sort(heights);

        for (int i=0; i<heights.length; i++){
            if (givenHeights[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}