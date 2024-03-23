class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // int[] result = new int[Math.min(nums1.length, nums2.length)];
        // int index = 0;
        // int i = 0;
        // int j = 0;

        // while (i < nums1.length && j < nums2.length) {
        //     if (nums1[i] == nums2[j]) {
        //         if (index == 0 || nums1[i] != result[index - 1]) {
        //             result[index++] = nums1[i];
        //         }
        //         i++;
        //         j++;
        //     } else if (nums1[i] < nums2[j]) {
        //         i++;
        //     } else {
        //         j++;
        //     }
        // }

        // return Arrays.copyOf(result, index);

        // int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                intersectionSet.add(nums2[j]);
            }
        }

        // Convert intersection set to array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }
        return result;
    }
}
