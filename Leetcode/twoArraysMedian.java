class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[1001];
        boolean isEven = ((nums1.length+nums2.length)%2==0) ? true : false;
        int mergedLength = ((nums1.length+nums2.length)/2)+1;
        double answer =0;
        int index1 = 0, index2 = 0;
        boolean firstIsOver = (nums1.length==0) ? true: false;
        boolean SecondIsOver = (nums2.length==0) ? true: false;

//        getting the half of merged arrays
        for (int i = 0; i<mergedLength; i++) {
                if (firstIsOver) {
                    nums3[i] = nums2[index2];
                    index2++;
                }
                else if (SecondIsOver) {
                    nums3[i] = nums1[index1];
                    index1++;
                    }
                else if (nums1[index1]<nums2[index2]) {
                    nums3[i] = nums1[index1];
                    index1++;
                    if (index1==nums1.length) firstIsOver = true;
                    }
                else if (nums1[index1]>nums2[index2]) {
                    nums3[i] = nums2[index2];
                    index2++;
                    if (index2==nums2.length) SecondIsOver = true;

                    }
                else {
                    nums3[i] = nums2[index2];
                    index2++;
                    if (index2==nums2.length) SecondIsOver = true;
                    i++;
                    nums3[i] = nums1[index1];
                    index1++;
                    if (index1==nums1.length) firstIsOver = true;
                    }
            System.out.println(nums3[i]);
            }
        if (isEven) {
            System.out.println(nums3[mergedLength-1]+","+nums3[mergedLength-2]);
            double x = nums3[mergedLength-1]+nums3[mergedLength-2];
            answer = x/2;
        }
        else {
            answer = nums3[mergedLength-1];
        }
        return answer;
    }
}