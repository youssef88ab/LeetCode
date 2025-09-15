class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0 ; 

        int rulekeyindex ;
        switch(ruleKey) {
            case "type" : 
                rulekeyindex = 0 ; 
                break ; 
            case "color" : 
                rulekeyindex = 1 ; 
                break ;
            default : rulekeyindex = 2 ; 
        }
        
        // Iterate Through List 
        for (List<String> innerlist : items)
        {
            if (innerlist.get(rulekeyindex).equals(ruleValue)) count++ ; 
        }
    
        return count ; 
    }
}