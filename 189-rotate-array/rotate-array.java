class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length < k){
            k = k % nums.length;
        }
        int arr[]=new int[nums.length];
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            arr[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length-k;i++){
            arr[j]=nums[i];
            j++;
        }
       System.arraycopy(arr, 0, nums, 0, nums.length);
    }
}