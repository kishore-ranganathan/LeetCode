class Solution {
    public int uniquePaths(int m, int n,int arr[][]) {
        if(m==0 && n==0) return 1;
        if(m <0 || n< 0) return 0;
        if(arr[m][n] != -1) return arr[m][n];
        int up = uniquePaths(m-1,n,arr);
        int left =uniquePaths(m,n-1,arr);

        return arr[m][n]=up+left;
    }
    public int uniquePaths(int m, int n) {
    int arr[][]=new int[m][n];
    
    for (int[] row : arr) {
        Arrays.fill(row, -1);
    }
    return uniquePaths(m-1,n-1,arr);
    }
    }
