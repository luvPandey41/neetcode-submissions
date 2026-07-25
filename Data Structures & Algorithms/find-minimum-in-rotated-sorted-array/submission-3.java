class Solution {
    public int findMin(int[] nums) {
        int upperIdx = nums.length - 1, lowerIdx = 0;
        while(true) {
            int check = (upperIdx + lowerIdx) / 2;
            if(upperIdx == lowerIdx) return nums[lowerIdx];
            if(nums[check] > nums[check + 1]) {
                return nums[check + 1];
            } else if(upperIdx - lowerIdx == 1) {
                return nums[lowerIdx];
            } else if (nums[check] < nums[upperIdx]){
                upperIdx = check;
            } else {
                lowerIdx = check;
            }
        }
    }
}
