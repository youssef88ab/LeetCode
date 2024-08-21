class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        ranlist = list()
        for i in ransomNote :
            ranlist.append(i)
        
        maglist = list()
        for j in magazine :
            maglist.append(j)

        for ch in ranlist : 
            if ch in maglist :
                maglist.remove(ch)
            elif ch not in maglist :
                return False 
        return True