class Solution {
    public int maxDepth(String s) {
        // Stack<Character> st=new Stack<Character>();
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'){
                max=Math.max(max,count);
                count--;
            }
        }
        return max;
    }
}