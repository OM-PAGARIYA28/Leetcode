class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=1;
         if (nums[0] != 0) {
            return 0;
        }
        for(i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                continue;
            }
            else{
                break;
            }
        }
        return nums[i-1]+1;
    }
}