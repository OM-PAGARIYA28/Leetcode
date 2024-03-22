class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            char curr_s=s.charAt(start);
            char curr_e=s.charAt(end);
            if(!Character.isLetterOrDigit(curr_s)){
                start++;
            }
            else if(!Character.isLetterOrDigit(curr_e)){
                end--;
            }
            else{
                if(Character.toLowerCase(curr_s)!=Character.toLowerCase(curr_e)){
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;
    }
}