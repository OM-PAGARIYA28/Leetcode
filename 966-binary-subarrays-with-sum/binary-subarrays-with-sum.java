// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         int i = 0;
//         int j = 0;
//         int sum = 0;
//         int count = 0;
//         int freq = 0;

//         while(i < nums.length) {
//             sum += nums[i];
//             if(nums[i] == 1) {
//                 freq = 0;
//             }
//             if(sum > goal) {
//                 sum -= nums[j];
//                 j++;
//             }
            
//             while(j <= i && sum == goal) {
//                 sum -= nums[j];
//                 j++;
//                 freq++;
//             }
//             count += freq;
//             i++;
//         }
//         return count;
//     }
// }


class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum =0 ;
        int count = 0;
        int n = nums.length;


        for(int i =0;i<n;i++)
        {
            sum =0 ;
            for(int j =i;j<n;j++)
            {
                sum +=nums[j];
                if(sum==goal)
                {
                    count++;
                }
            }
        }
        return count;

    }
}