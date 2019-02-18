class Solution {
    public int maxArea(int[] height) {
        int i = 0; 
        int j = height.length - 1;
        int max = 0;
        while(i < j) {
            int area = 0;
            if(height[i] < height[j]) {
                area = height[i] * (j - i);
                i ++;
            }else {
                area = height[j] * (j - i);
                j --;
            }
            max = Math.max(max, area);
        }
        return max;
    }
}

