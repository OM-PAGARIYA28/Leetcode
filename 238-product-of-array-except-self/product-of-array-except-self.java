class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int count=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            if(nums[i]!=0){
            product*=nums[i];
            }
            else{
                continue;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(count==0){
                arr[i]=product/nums[i];
            }
            if(count==1){
                if(nums[i]!=0){
                    arr[i]=0;
                }
                else{
                   arr[i]=product; 
                }
            }
            if(count>=2){
                arr[i]=0;
            }
        }
        return arr;
    }
}