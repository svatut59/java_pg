class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int left = 0;
        int right = 0;
        int ans = 0;
        // Sliding window approach
        while(right < s.length()){
            
            // Keep removing the elements from the set until the set
            // contains character at right index and update the left index
            while(left != right && st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }
            
            // update the ans 
            // rightIndex - leftIndex will the window length  + 1(0 based indexing)
            ans = Math.max(ans, right - left + 1);
            
            // add the character at right index;
            st.add(s.charAt(right));
            
            right++;
        }
        return ans;
    }
}