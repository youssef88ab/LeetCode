class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        for (string &N : words )
        {
            string Rev = "" ;
            for (int i = N.length()-1 ; i >= 0 ; i--)
            {
                Rev += N[i];
            }
            if (Rev == N) return N;
        }
          return "";
    }
      
};