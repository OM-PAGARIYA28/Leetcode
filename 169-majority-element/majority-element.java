class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int max=0;
        int major=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
            if(count > max){
                max=count;
                major=nums[i-1];
            }
            count=1;
            }
        }
         if (count > max) {
            major = nums[nums.length - 1];
        }

        return major;
    }
}