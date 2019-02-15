class Solution {
    public String convert(String s, int numRows) {
        List<String> res = new ArrayList<>(Collections.nCopies(numRows, ""));
        int p = numRows * 2 - 2;
        if(p == 0) {
            return s;
        }
        for(int i = 0; i < s.length(); i++){
            int row = i % p;
            if(row > numRows - 1){
                row = p - row;
            }
            res.set(row, res.get(row) + s.charAt(i));
        }
        return String.join("", res);
    }
}
