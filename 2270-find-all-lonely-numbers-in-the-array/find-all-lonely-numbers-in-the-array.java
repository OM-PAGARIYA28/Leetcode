class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(m.get(nums[i])==1 && !m.containsKey(nums[i]-1) && !m.containsKey(nums[i]+1)){
                l.add(nums[i]);
            }
        }
        return l;
    }
}