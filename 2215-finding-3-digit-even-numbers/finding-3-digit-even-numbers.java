class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> s=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;
            int first=digits[i];
            for(int j=0;j<n;j++){
                if(j==i) continue;
                int second=digits[j];
                for(int k=0;k<n;k++){
                    if(k==j || k==i) continue;
                    if(digits[k] % 2==0){
                        s.add(first*100+second*10+digits[k]);
                    }
                }
            }
        }
       int[] arr = new int[s.size()];
        int idx = 0;
        for (Integer num : s) {
            arr[idx] = num;
            idx++;
        }
        Arrays.sort(arr);
        return arr;
    }
}