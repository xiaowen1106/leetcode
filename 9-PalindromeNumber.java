class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while(x > revertedNumber){ // To the middle
            int pop = x % 10;
            revertedNumber = revertedNumber * 10 + pop;
            x = x/10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }
}
