class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> frequencies = new HashMap<>();
        for(int i : nums) {
            if(frequencies.containsKey(i)) {
                frequencies.put(i, frequencies.get(i) + 1);
            } else frequencies.put(i, 1);
        }
        Set<Integer> keys =  frequencies.keySet();
        int[] ret = new int [k];
        for(int i = 0; i < k; i++) {
            int x = findLargest(keys, frequencies);
            ret[i] = x;
            keys.remove(x);
        }
        return ret;
    }
    public int findLargest(Set<Integer> a, Map<Integer, Integer> b) {
        int max = 0, index = 0;
        for(int i : a) {
            if(b.get(i) > max) {
                max = b.get(i);
                index = i;
            }
        }
        return index;
    }
}
