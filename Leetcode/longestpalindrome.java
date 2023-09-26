class Solution {
    public String longestPalindrome(String s) {
        if (s.length()==1) return s;
        int n = s.length();
        int maxLength = 0;
        String palindrome =s.substring(0,1);
        for (int i = 0; i<n; i++) {
            int evenLen = 0, oddLen = -1;
            
            //searching for palindrome with odd number of characters
            int left = i, right = i;
            while (left>=0 && right <n) {
                if (s.charAt(left)!=s.charAt(right)) {
                    break;
                }
                oddLen+=2;
                left--;
                right++;
            }
            if (oddLen>maxLength ) {
                maxLength =oddLen;
                palindrome = s.substring(left+1, right);
                }

            
            
            left = i; 
            right = i+1;
            while (left>=0 && right <n) {
                if (s.charAt(left)!=s.charAt(right)) {
                    break;
                }
                evenLen+=2;
                left--;
                right++;
            }
            if (evenLen>maxLength ) {
                maxLength =evenLen;
                palindrome = s.substring(left+1, right);
                }
        }
        return palindrome;
    }
}