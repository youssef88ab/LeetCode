class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector <string> Result;
        for (int i = 1 ; i <= n ; i++)
        {
            if (i%3 == 0 && i%5 == 0) Result.push_back("FizzBuzz");
            else if (i%3 == 0 && i%5 != 0) Result.push_back("Fizz");
            else if (i%5 == 0 && i%3 != 0) Result.push_back("Buzz"); 
            else Result.push_back(to_string(i));
        }
            return Result;
    }
};