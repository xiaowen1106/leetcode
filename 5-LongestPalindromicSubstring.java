class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        for(int l = length; l > 0; l--){
            for(int i = 0; i <= length - l; i ++){
                String subStr = s.substring(i, l+i);
                if(isPalindrome(subStr)){
                    return subStr;
                }
            }
        }
        return "";
    }
    
    private boolean isPalindrome(String s){
        int length = s.length();
        int i = 0;
        while(i < length-i-1){
            if(s.charAt(i) != s.charAt(length-i-1)){
                return false;
            }
            i++;
        }
        return true;
    }
}
