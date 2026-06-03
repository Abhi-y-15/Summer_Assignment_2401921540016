

class Solution {
    public int maxArea(int[] height) {
        int x= 0;
        int y = height.length - 1;
        int maxA= 0;
        while (x < y) {
            int width = y-x;
            int h = Math.min(height[y], height[x]);
            maxA = Math.max(maxA, width * h);
            if (height[x] < height[y]) {
                x++;
            } else {
                y--;
            }
        }
        return maxA;
    }
}