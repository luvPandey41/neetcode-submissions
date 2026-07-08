class Solution {
    public boolean isPalindrome(String s) {
        String real = "";
        String w = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            if(w.charAt(i) >= 'a' && w.charAt(i) <= 'z' || w.charAt(i) >= '0' && w.charAt(i) <= '9') {
                real += w.charAt(i);
            }
        }
        for(int i = 0; i < real.length(); i++) {
            if(real.charAt(i) != real.charAt(real.length()-1-i)) return false;
        }
        return true;
    }
}
