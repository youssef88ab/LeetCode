class Solution {
public:
    vector<double> convertTemperature(double celsius) {
        vector <double> vDouble;
        vDouble.push_back(celsius +273.15);
        vDouble.push_back(celsius * 1.80 + 32);
        return vDouble; 
    }
};