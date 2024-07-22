class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map= new HashMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }

        String[] str=new String[heights.length];
        Arrays.sort(heights);
        int idx=0;
        for (int i = heights.length - 1; i >= 0; i--) {
            str[idx] = map.get(heights[i]);
            idx++;
        }
        return str;
    }
}