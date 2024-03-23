class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];

//         int a=nums[0];
//         int count=1;
//         for(int i=1;i<nums.length;i++){
//             if(a==nums[i]){
//                 count++;
//             }
//             else{
//                 if(count==0){
//                    a=nums[i];
//                    count++;
//                 }
//                 else{
//                     count--;
//                 }
                
//             }

//         }
//         return a;
//     }
// }

HashMap<Integer,Integer> map=new HashMap<>();
int n=nums.length;
for(int i=0;i<n;i++){
    if(map.containsKey(nums[i])){
        map.put(nums[i],map.get(nums[i])+1);
    }
    else{
        map.put(nums[i],1);
    }
}
for(int key:map.keySet() ){
    if(map.get(key)>(n/2))
    return key;
}
return -1;
    }
}