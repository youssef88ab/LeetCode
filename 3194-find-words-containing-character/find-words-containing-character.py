class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        seen = list()
        for i in range(len(words)) : 
            if (words[i].find(x) != -1) : seen.append(i)
        return seen
        