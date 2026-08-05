class Solution {
public:
    string reverseWords(string s) {
        string ans = "";
        int n = s.length();
        int i = 0;

        while (i < n) {
            while (i < n && s[i] == ' ')
                i++;

            if (i >= n)
                break;

            int start = i;

            while (i < n && s[i] != ' ')
                i++;

            for (int j = i - 1; j >= start; j--)
                ans += s[j];

            while (i < n && s[i] == ' ')
                i++;

            if (i < n)
                ans += ' ';
        }

        return ans;
    }
};