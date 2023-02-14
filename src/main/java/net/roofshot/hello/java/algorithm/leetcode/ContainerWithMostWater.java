package net.roofshot.hello.java.algorithm.leetcode;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left != right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);

            max = Math.max(max, w*h);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

}
