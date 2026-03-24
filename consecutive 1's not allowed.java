class Solution {
    int countStrings(int n) {
        if (n==1) {
            return 2;
        }
        if (n==2) {
            return 3;
        }
        int []arr = new int[n+1];
        arr[1] = 2;
        arr[2] = 3;
        for(int i=3;i<=n;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
