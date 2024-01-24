class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> result= new ArrayList<>();
       int maxcandy=findmax(candies);

       for (int i = 0; i < candies.length; i++) {
            int totalCandies = candies[i] + extraCandies;
            boolean hasGreatestCandies = totalCandies >= maxcandy;
            result.add(hasGreatestCandies);
        }
        return result;
    }

       public int findmax(int[] candies){
           int max=candies[0];
           for(int i=1;i<candies.length;i++){
               max=Math.max(max,candies[i]);
           }
           return max;
       }
}