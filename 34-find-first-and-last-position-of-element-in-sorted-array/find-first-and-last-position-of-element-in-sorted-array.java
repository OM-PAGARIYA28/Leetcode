class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                // Expand the range to find the leftmost and rightmost positions
                int start = mid;
                int end = mid;
                
                // Find the leftmost position
                while (start > 0 && nums[start - 1] == target) {
                    start--;
                }
                
                // Find the rightmost position
                while (end < nums.length - 1 && nums[end + 1] == target) {
                    end++;
                }
                
                return new int[]{start, end};
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return new int[]{-1, -1}; // Target not found
    }
}
