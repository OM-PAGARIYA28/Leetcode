class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
       int c=1;
       for(int i=0;i<nums.length;i++){
       while(nums[i]>9){
        c++;
        nums[i]=nums[i]/10;
       }
       if(c%2==0){
        count++;
        c=1;
       }
       }
       return count;
    }
}