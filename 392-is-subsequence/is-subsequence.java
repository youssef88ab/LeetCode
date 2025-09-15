class Solution {
    public boolean isSubsequence(String s, String t) {

        int j = 0 ;
        for (char c : t.toCharArray())
        {
            if (j == s.length()) break;
            if (s.charAt(j) == c) j++ ; 
        }    

        if (j == s.length()) return true ; 
        else return false ; 
    }
}