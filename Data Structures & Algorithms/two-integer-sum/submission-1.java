class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int goal = target - nums[i];
            for(int j = 0; j < nums.length; j++) {
                if(j != i && nums[j] == goal) return new int[] {i, j};
            }            
        }
        return null;
    }
}
