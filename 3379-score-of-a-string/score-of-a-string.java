class Solution {
    public int scoreOfString(String s) {
        int count=0;
        for(int i=1;i<s.length();i++){
            count+=Math.abs(s.charAt(i-1)-s.charAt(i));
        }
        return count;
    }
}