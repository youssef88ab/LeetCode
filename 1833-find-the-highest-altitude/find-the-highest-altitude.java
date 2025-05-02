class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitudes  = new int[gain.length + 1 ] ;
        altitudes[0] = 0 ; 

        // Add To Altitudes Table ; 
        for (int i = 1 ; i <= gain.length ; i++ ) {
            altitudes[i] = altitudes[i-1] + gain[i-1] ;
        }

        // Find Max Altitude ; 
        int max = altitudes[0] ;
        for (int i = 1 ; i < altitudes.length ; i++) {
            if (altitudes[i] > max) {
                max = altitudes[i];
            }
        } 

        return max;
    }
}