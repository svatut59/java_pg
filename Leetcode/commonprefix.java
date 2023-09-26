class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result ="";
        int n = strs.length;
        int length = strs[0].length();
        for (int i=1; i<n; i++) {
            for (int j=0; j<length; j++) {
                if (j==strs[i].length()) {
                    length=j;
                    break;
                }
                if (strs[0].charAt(j)!=strs[i].charAt(j)) {
                    length=j;
                    break;
                }
            }
        }
        if (length>0) {
            result = strs[0].substring(0, length);
        }
        return result;
    }
}