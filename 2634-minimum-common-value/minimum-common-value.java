class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        long l1=0;
        long l2=0;
        while(l1 < nums1.length && l2 < nums2.length){
            if(nums1[(int)l1]==nums2[(int)l2]){
                return nums1[(int)l1];
            }
            else if(nums1[(int)l1]<nums2[(int)l2]){
                l1++;
            }
            else{
                l2++;
            }
        }
        return -1;
    }
}