class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            if(strs[i] != null) {
                List<String> a = new ArrayList<>();
                a.add(strs[i]);
                for(int j = i + 1; j < strs.length; j++) {
                    if(strs[j] != null) {
                        if(isAnagram(strs[i], strs[j])) {
                            a.add(strs[j]);
                            strs[j] = null;
                        }
                    }
                }
                ret.add(a);
            }
        }
        return ret;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> letters = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(letters.containsKey(s.charAt(i))) {
                letters.put(s.charAt(i), letters.get(s.charAt(i)) + 1);
            }            
            letters.putIfAbsent(s.charAt(i), 1);
        }
        for(int i = 0; i < t.length(); i++) {
            if(letters.containsKey(t.charAt(i))) {
                if (letters.get(t.charAt(i)) == null || letters.get(t.charAt(i)) <= 0) return false;
                else letters.put(t.charAt(i), letters.get(t.charAt(i)) - 1);
            }
        }
        for (int count : letters.values()) if (count != 0) return false;
        return true;
    }
}
