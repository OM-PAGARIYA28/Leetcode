class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        StringBuilder a = new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(ones>1){
                a.append('1');
                ones--;
            }
            else{
            a.append('0');
            }
        }
        a.append('1');
        return a.toString();
    }
}