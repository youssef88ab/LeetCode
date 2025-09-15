class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0 ; i < arr.length - 1 ; i++)
        {
            arr[i] = max_array(arr , i + 1);
        }
        
        arr[arr.length - 1] = -1 ; 

        return arr ; 
    }

    public int max_array(int[] arr , int startIndex ) {
        int max = arr[startIndex] ; 
        for (int i = startIndex ; i < arr.length ; i++)
        {
            if (arr[i] > max) max = arr[i] ; 
        }
        return max ;
    }
}