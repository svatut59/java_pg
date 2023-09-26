class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        else if (x<10) {
            return true;
        }
        else {
            String str = Integer.toString(x);
            int i=0, j =str.length()-1;
            while (i<=j) {
                if (str.charAt(i)!= str.charAt(j)) {
                    return false;
                }
            i++;
            j--;
        }
            return true;
        }
    }
}