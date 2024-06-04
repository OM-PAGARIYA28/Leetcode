class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> ch =new HashSet<>();
        int length=0;
        for(char c:s.toCharArray()){
            if(ch.contains(c)){
                ch.remove(c);
                length+=2;
            }
            else{
                ch.add(c);
            }
        }
        if(!ch.isEmpty()){
            length++;
        }
        return length;
    }
}