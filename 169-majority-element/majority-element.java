class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];

        int a=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(a==nums[i]){
                count++;
            }
            else{
                if(count==0){
                   a=nums[i];
                   count++;
                }
                else{
                    count--;
                }
                
            }

        }
        return a;
    }
}