class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        for(int i = 0; i < heights.length; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                if((j-i)*(Math.min(heights[j], heights[i])) > max) {
                    max = (j-i)*(Math.min(heights[j], heights[i]));
                }
            }
        }
        return max;

    }
}
