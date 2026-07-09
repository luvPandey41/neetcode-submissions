class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int num1, num2, num3, target;
        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0; i < nums.length; i ++) {
            num1 = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                num2 = nums[j];
                target = -(num1 + num2);
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[k] == target) {
                        List<Integer> temp = new ArrayList<>();
                        if(nums[i] < nums[j] && nums[i] < nums[k]) {
                            temp.add(nums[i]);
                            if(nums[j] < nums[k]) {
                                temp.add(nums[j]);
                                temp.add(nums[k]);
                            }
                            else {
                                temp.add(nums[k]);
                                temp.add(nums[j]);
                            }
                        } else if(nums[j] < nums[i] && nums[j] < nums[k]) {
                            temp.add(nums[j]);
                            if(nums[i] < nums[k]) {
                                temp.add(nums[i]);
                                temp.add(nums[k]);
                            }
                            else {
                                temp.add(nums[k]);
                                temp.add(nums[i]);
                            }
                        } else {
                            temp.add(nums[k]);
                            if(nums[j] < nums[i]) {
                                temp.add(nums[j]);
                                temp.add(nums[i]);
                            }
                            else {
                                temp.add(nums[i]);
                                temp.add(nums[j]);
                            }
                        }
                        if(!(ret.contains(temp))) ret.add(temp);

                    }
                }
                
            }
        }
        return ret;
    }
}
