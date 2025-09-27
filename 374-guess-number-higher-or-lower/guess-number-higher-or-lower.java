public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;   // found the number
            } else if (res == -1) {
                high = mid - 1;  // number is smaller
            } else {
                low = mid + 1;   // number is bigger
            }
        }
        return -1;  // should never reach here
    }
}
