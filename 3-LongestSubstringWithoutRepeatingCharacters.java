class Solution {
    public int lengthOfLongestSubstring(String s) {
        int largest = 0;
        int p = 0;
        Map<Character, Integer> appeared = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(appeared.containsKey(s.charAt(i))){
                p = Math.max(appeared.get(s.charAt(i)), p);
            }
            appeared.put(s.charAt(i), i+1);
            largest = Math.max(i-p+1, largest);
        }
        return largest;
    }
}
