class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        int zero=0, ones=0,max=0;
        hashmap.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                ones++;
            }
            int diff= zero-ones;
            if(hashmap.containsKey(diff)){
                 max = Math.max(max, i - hashmap.get(diff));
               
            }
            else{
                hashmap.put(diff,i);
            }
        }
        return max;
    }
}