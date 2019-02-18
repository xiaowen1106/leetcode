class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 1; i < height.length; i++){
            for(int j = 0; j < i; j++){
                int area  = Math.min(height[i], height[j]) * (i-j);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
