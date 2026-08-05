#include <string>

class Solution {
public:
    string removeSpaces(string& s) {
        string result = "";
        for (char c : s) {
            if (c != ' ') {
                result += c; // Add character if it is not a space
            }
        }
        return result;
    }
};
