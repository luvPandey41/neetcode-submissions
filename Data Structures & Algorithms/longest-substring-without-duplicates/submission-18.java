class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int max = 0, curr = 0, start = 0;
        HashSet<Character> present = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(present.contains(s.charAt(i))) {

                if (curr > max)  max = curr;
                curr = 0;
                i = start;
                start += 1;
                present.clear();

            } else {

                present.add(s.charAt(i));
                curr ++;

            }
        }

        return Math.max(max, curr);
    }
}
