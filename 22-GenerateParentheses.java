class Solution {
    public List<String> generateParenthesis(int n) {
        if(n == 0) {
            return Arrays.asList("");
        }
        return generateParenthesis("", 0, n, n);
    }
    
    private List<String> generateParenthesis(String res, int val, int open, int close){
        List<String> ans = new ArrayList<>();
        if(open == 0 && close == 1) {
            ans.add(res + ")");
        }else if(open == 1 && close == 0) {
            ans.add(res + "(");
        }
        if(val > 0) {
            if(open > 0) {
                ans.addAll(generateParenthesis(res+"(", val + 1, open - 1, close));
            }
            if(close > 0) {
                ans.addAll(generateParenthesis(res+")", val - 1, open, close - 1));
            }
        }else if(val == 0) {
            if(open > 0) {
                ans.addAll(generateParenthesis(res+"(", val + 1, open - 1, close));
            }
        }
        return ans;
    }
}
