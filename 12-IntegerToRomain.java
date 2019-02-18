class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> symbols = new HashMap<>();
        symbols.put(1, "I");
        symbols.put(4, "IV");
        symbols.put(5, "V");
        symbols.put(9, "IX");
        symbols.put(10, "X");
        symbols.put(40, "XL");
        symbols.put(50, "L");
        symbols.put(90, "XC");
        symbols.put(100, "C");
        symbols.put(400, "CD");
        symbols.put(500, "D");
        symbols.put(900, "CM");
        symbols.put(1000, "M");
        int[] roots = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        String romain = "";
        while(num > 0){
            for (int i = 0; i < roots.length; i++) {
                int count = num/roots[i];
                num = num - count * roots[i];
                romain += String.join("", Collections.nCopies(count, symbols.get(roots[i])));
            }
        }
        return romain;
    }
}
