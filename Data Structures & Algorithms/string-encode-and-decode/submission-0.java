class Solution {

    public String encode(List<String> strs) {
        String ret = "";
        for(String i : strs) {
            ret += i + '\u00A9';
        }
        return ret;
    }

    public List<String> decode(String str) {
        StringBuilder curr = new StringBuilder("");
        List <String> ret = new ArrayList<>();
        for(int j = 0; j < str.length(); j++) {
            char i = str.charAt(j);
            if(i != '\u00A9') {
                curr.append(i);
            } else {
                ret.add(curr.toString());
                curr.replace(0, curr.length(), "");
            }
        }
        return ret;
    }
}
