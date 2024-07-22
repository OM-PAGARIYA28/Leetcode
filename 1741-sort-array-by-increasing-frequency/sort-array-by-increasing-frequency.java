class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        Comparator<Integer> comp = (a,b)->{
          return freq.get(a)!=freq.get(b)?freq.get(a)-freq.get(b):b-a;  
        };
        
        Integer[] ans = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        Arrays.sort(ans,comp);
        for(int i=0;i<nums.length;i++){
            nums[i] = ans[i];
        }
        return nums;
    }
}