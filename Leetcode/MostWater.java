class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i=0, j=height.length-1;
        while (i<j) {
            int current = (j-i) * Math.min(height[i], height[j]);
            if (current>max) max = current;
            if (height[i]<height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        
        return max;
    }
}