class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int i = 0;
        while(i < str.length() - i){
            int pop = x % 10;
            x = (x - pop) / 10;
            if(String.valueOf(Math.abs(pop)).charAt(0) != str.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }
}
