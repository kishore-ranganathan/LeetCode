class Solution {
    public int diagonalPrime(int[][] nums) {
        
        Solution object = new Solution();

        List<Integer> list = new ArrayList();

        for( int i = 0 ; i < nums.length ; i ++ ){
            
            if( object.prime( nums[i][i])) list.add( nums[i][i] );

            if( object.prime( nums[ nums.length - i - 1 ][i])) list.add( nums[ nums.length - i - 1 ][i]);

        }

        Collections.sort(list);

        return list.isEmpty() ? 0 : list.get( list.size() - 1 );

    }

    boolean prime( int k){

        if( k <= 1 ) return false;

        for( int i = 2 ; i <= Math.sqrt(k) ; i ++ ) {

            if( k % i == 0) return false;

        }

        return true;

    } 
}