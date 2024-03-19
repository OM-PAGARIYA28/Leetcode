class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        int max=0;
        for(char task:tasks){
            freq[task-'A']++;
            max=Math.max(max,freq[task-'A']);
        }
        int num_maxFreq=0;
        for(int frequency:freq){
            if(frequency==max){
                num_maxFreq++;
            }
        }
        int a=Math.max((n+1)*(max-1)+num_maxFreq,tasks.length);
        return a;
    }
}