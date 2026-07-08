class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        int streak = 1;
        if(nums.length == 0) return 0;
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - prev == 1) {
                streak += 1;
            } else if (nums[i] == prev) {
            } else {
                if(streak > max) max = streak;
                streak = 1;
            }
            prev = nums[i];
        }
        if(streak > max) max = streak;
        return max;
    }
}
