class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return abc(nums,k)-abc(nums,k-1);
    }

        public int abc(int[] nums,int k){
        int left=0;
        int count=0;
        int l=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2 != 0){
                count++;
            }
            if(count<=k){
                l+= right-left+1;
            }
            while(left<=right && count>k){
                 if(nums[left]%2 != 0) {
                    count--;
                }
                left++;
                if(count<=k){
                l+=right-left+1;
            }
            }
        }
        return l;
    }
}