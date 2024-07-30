class Solution {
    public int numberOfBeams(String[] bank) {
        int total = 0;
        int prev=0;
        for(int i=0;i<bank.length;i++){
            int ones=0;
            for(char ch:bank[i].toCharArray()){
                if(ch=='1'){
                    ones++;
                }
            }
                if(ones>0){
                    if(prev>0){
                        total+=prev*ones;
                    }
                    prev=ones;
                }
        }
        return total;
    }
}