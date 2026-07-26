class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int goal = target - nums[i];
            if(map.containsKey(goal)) {
                if(i != map.get(goal)){
                    int[] ret = {i, map.get(goal)};
                    return ret;
                }
            }
        }
        return null;
    }
}
