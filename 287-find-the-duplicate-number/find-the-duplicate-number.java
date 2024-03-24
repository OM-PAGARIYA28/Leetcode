class Solution {
    public int findDuplicate(int[] nums) {
    //    HashMap<Integer,Integer> map=new HashMap<>();
    //    for(int i=0;i<nums.length;i++){
    //     if(map.containsKey(nums[i])){
    //         map.put(nums[i],map.get(nums[i])+1);
    //     }
    //     else{
    //         map.put(nums[i],1);
    //     }
    //    }
    //    for(int i=0;i<nums.length;i++){
    //     if(map.get(nums[i])>1){
    //         return nums[i];
    //     }
    //    } 

      HashSet<Integer> h=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        if(h.contains(nums[i])){
            return nums[i];
        }
        h.add(nums[i]);
      }
       return 0;
    }
}