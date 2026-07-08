class Solution {
    public int[] productExceptSelf(int[] nums) {
        int tot = 1;
        int [] ret = new int [nums.length];
        for(int i = 0; i < nums.length; i++) {
            tot *= nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                ret[i] = tot/(nums[i]);
            } else {
                int temp = 1;
                for(int j = 0; j < nums.length; j++) {
                    if(j != i) temp *= nums[j];
                }
                ret[i] = temp;
            }
        }
        return ret;
    }
}  
