class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,r=0,n=nums.length;
        long sum=0,maxFreq=1;
        for(r=0;r<n;r++){
            sum+=nums[r];
            while(l+1<=r && (nums[r]*(r-l+1L))>sum+k){
                sum-=nums[l];
                l++;
            }
            maxFreq=Math.max(maxFreq,r-l+1L);
        }
        return (int)maxFreq;
    }
}