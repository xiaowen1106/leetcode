class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!pairs.containsKey(c)){
                stack.push(c);
            }else if(stack.isEmpty() || stack.pop() != pairs.get(c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
