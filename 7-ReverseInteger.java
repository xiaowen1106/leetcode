class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0){
            int pop = x % 10;
            x = x / 10;
            if(isOverflow(ans, pop)){
                return 0;
            }
            ans = ans * 10 + pop;
        }
        return ans;
    }
    
    private boolean isOverflow(int ans, int pop){
        if(ans > Integer.MAX_VALUE/10 ||
           (Integer.MAX_VALUE/10 == ans && pop > 7)){
            return true;
        } else if(ans < Integer.MIN_VALUE/10 ||
            (Integer.MIN_VALUE/10 == ans && pop < -8)){
            return true;
        } else{
            return false;  
        }
    }
}
