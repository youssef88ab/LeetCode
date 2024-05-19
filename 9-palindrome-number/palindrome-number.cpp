class Solution {
public:
    bool isPalindrome(int x) {
        string y = to_string(x);
        if (y[0] == '-') return false;
        for (int i = y.length() -1 ,  j = 0 ; i > 0 , j < y.length() -1 ; i-- , j++)
        {
            if ( y[j] != y[i]) return false; 
        }
        return true;

    }
};