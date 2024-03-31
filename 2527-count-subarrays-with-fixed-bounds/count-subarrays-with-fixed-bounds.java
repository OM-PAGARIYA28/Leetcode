class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
      long l=-1,r=-1,k=-1; //l=lastMinIndex, r=lastMaxIndex,k=lastInvalidIndex
      long ans=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]<minK || nums[i]>maxK){
            k=i;
        }
        if(nums[i]==minK){
            l=i;
        }
        if(nums[i]==maxK){
            r=i;
        }
        ans+=Math.max(0,Math.min(l,r)-k);
      }  
      return ans;
    }
}