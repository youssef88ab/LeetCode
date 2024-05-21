class Solution {
public:
    int numberOfSteps(int num) {
        int Res = 0;
        while (num > 0)
        {
            if (num % 2 == 0) num /= 2;
            else num--;
            Res++;
        }
        return Res; 
    }
};