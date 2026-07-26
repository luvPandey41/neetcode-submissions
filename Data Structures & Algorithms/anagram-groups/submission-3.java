class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // alphabetical order letters (String), original order (list of strings)
        HashMap<String, List<String>> map = new HashMap<>();
       
        for(String i : strs) {
            String ordered = getOrdered(i);
            if(map.containsKey(ordered)) {
                List<String> temp = map.get(ordered);
                temp.add(i);
                map.put(ordered, temp);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(i);
                map.put(ordered, temp);
            }
        }

        List<List<String>> ret = new ArrayList<>();
        for(String i : map.keySet()) {
            ret.add(map.get(i));
        }

        return ret;
    }

    public String getOrdered(String orig) {
        char[] chars = orig.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
