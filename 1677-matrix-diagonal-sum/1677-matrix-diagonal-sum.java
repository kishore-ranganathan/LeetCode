class Solution {
    public int diagonalSum(int[][] matrix) {
        
        int ans = 0 ;

        for( int i = 0 ;i < matrix.length ; i++){

            ans += matrix[i][i];

            ans += matrix[matrix.length - i - 1 ][i];

        }

        return matrix.length%2 != 0 ? ans - matrix[ matrix.length / 2][ matrix.length / 2] : ans;
    }
}