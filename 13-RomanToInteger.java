class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);
        Map<String, Integer> combos = new HashMap<>();
        combos.put("IV", 4);
        combos.put("IX", 9);
        combos.put("XL", 40);
        combos.put("XC", 90);
        combos.put("CD", 400);
        combos.put("CM", 900);
        int ans = 0;
        int i = 0;
        while(i < s.length()){
            if(i < s.length() - 1 && combos.containsKey(s.substring(i, i+2))){
                ans += combos.get(s.substring(i, i+2));
                i += 2;
            }else{
                ans += symbols.get(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}
