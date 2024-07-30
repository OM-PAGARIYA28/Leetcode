class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(char ch: s.toCharArray())
        if(!st.isEmpty() && st.peek()=='b' && ch=='a'){
            count++;
            st.pop();
        }
        else{
            st.push(ch);
        }
        return count;
    }
}