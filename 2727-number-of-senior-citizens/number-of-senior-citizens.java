class Solution {
    public int countSeniors(String[] details) {

        int count = 0 ; 
        int age ; 
        for (int i = 0 ; i < details.length ; i++)
        {
            // Access to age value and convert it to int variable ; 
            age =  (details[i].charAt(11) - '0') * 10 + (details[i].charAt(12) - '0') ; 
            // Compare age value with 60 & Count ; 
            if (age > 60) count++ ;
        }
        return count ; 
    }
}