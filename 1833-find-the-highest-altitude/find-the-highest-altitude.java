class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]=gain[i-1]+arr[i-1];
        }
        int maxAltitude = arr[0];
           for (int i = 0; i < arr.length; i++) {
              maxAltitude = Math.max(maxAltitude, arr[i]);
}
return maxAltitude;   
 }
}