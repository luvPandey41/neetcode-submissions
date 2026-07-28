class Solution {
    public int search(int[] nums, int target) {

        int l = 0, r = nums.length - 1;
        while(l < r) {
            int m = (l + r) / 2;
            if(nums[m] > nums[r]) {
                l = m + 1;
            } else { 
                r = m;
            }
        }

        Arrays.sort(nums);

        int upper = nums.length - 1, lower = 0, curr = upper/2;
       
        while(upper >= lower) {
            curr = (upper + lower)/2;
            if(nums[curr] == target) return (curr + l)%nums.length;
            else if(nums[curr] > target) upper = curr - 1;
            else lower = curr + 1;
        }

        return -1;
    }

}
