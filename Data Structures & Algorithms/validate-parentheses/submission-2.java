class Solution {
    public boolean isValid(String s) {
        Stack<Character> counter = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '[') {
                counter.push(x);
            } else if (x == ')') {
                if(counter.isEmpty()) return false;
                if(counter.peek() == '(') counter.pop();
                else return false;
            } else if (x == ']') {
                if(counter.isEmpty()) return false;
                if(counter.peek() == '[') counter.pop();
                else return false;
            } else if (x == '}') {
                if(counter.isEmpty()) return false;
                if(counter.peek() == '{') counter.pop();
                else return false;
            }
        }
        return counter.isEmpty();
    }
}
