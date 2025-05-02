class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         int ptr ;

        for (int i = 0 ; i < image.length ; i++) {
            // Flip Horizantly ;
            for (int j = 0 ; j < (image[i].length)/2 ; j++) {
                ptr = image[i][j] ;
                image[i][j] = image[i][image[i].length - j - 1]  ;
                image[i][image[i].length - j - 1] = ptr  ;
            }
            // Invert
            for (int j = 0 ; j < image[i].length ; j++) {
                image[i][j] =  image[i][j] == 0 ? 1 : 0 ;
            }
        }

        return image ;
    }
}