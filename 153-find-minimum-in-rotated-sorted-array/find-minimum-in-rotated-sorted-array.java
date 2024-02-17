class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int last=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[start]<=nums[last]){
                ans=Math.min(ans,nums[start]);
                break;
            }

            if(nums[start]<=nums[mid]){
                 ans=Math.min(ans,nums[start]);
                 start=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                last=mid-1;
            }
        }
        return ans;
    }
}