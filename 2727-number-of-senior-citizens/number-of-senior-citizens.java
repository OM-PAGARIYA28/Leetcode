class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++){
            int a=details[i].charAt(11)-'0';
            int b=details[i].charAt(12)-'0';
            int total=(a*10)+b;

            if(total>60){
                c++;
            }
        }
        return c;
    }
}