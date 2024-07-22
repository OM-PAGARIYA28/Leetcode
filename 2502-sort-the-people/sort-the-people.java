class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map= new TreeMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }

        String[] str=new String[heights.length];
        int idx=heights.length-1;
        for(String name :map.values()){
            str[idx--]=name;
        }
        return str;
    }
}