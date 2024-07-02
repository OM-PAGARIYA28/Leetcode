class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l=0;
        int r=0;
        List<Integer> list=new ArrayList<>();
        while(l<nums1.length && r<nums2.length){
            if(nums1[l]==nums2[r]){
                list.add(nums1[l]);
                l++;
                r++;
            }
            else if(nums1[l]<nums2[r]){
                l++;
            }
            else{
                r++;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}