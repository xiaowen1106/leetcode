class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0){
            return prefix;
        }else if(strs.length == 1){
            return strs[0];
        }
        for(int i = 0; i < strs[0].length(); i++){
            char current = strs[0].charAt(i);
            boolean match = true;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != current){
                    match = false;
                    break;
                }
            }
            if(match){
                prefix += strs[0].charAt(i);
            }else{
                break;
            }
        }
        return prefix;
    }
}
