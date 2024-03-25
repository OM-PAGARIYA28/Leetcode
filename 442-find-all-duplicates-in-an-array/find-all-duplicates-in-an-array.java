// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         List<Integer> duplicate=new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i],map.get(nums[i])+1);
//             }
//             else{
//                 map.put(nums[i],1);
//             }
//         }
//         for(int num : map.keySet()){
//             if(map.get(num)>1){
//                 duplicate.add(num);
//             }
//         }
//         return duplicate;
//     }
// }

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        var dup=new ArrayList<Integer>();
        var data=new HashSet<Integer>();
        for(int num:nums){
            if(data.contains(num)){
                dup.add(num);
            }else{
                data.add(num);
            }
        }
        return dup;
        
    }
}