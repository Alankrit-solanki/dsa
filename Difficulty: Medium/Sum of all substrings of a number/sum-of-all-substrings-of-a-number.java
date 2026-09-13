class Solution {
    public static int sumSubstrings(String s) {
    int sum =0;
    int n = s.length();
    for(int i=0;i<s.length();i++){
        for(int j =i;j<s.length();j++){
            String sub =s.substring(i,j+1);
            sum+=Integer.parseInt(sub);
        }
    }
    return sum;
    }
}