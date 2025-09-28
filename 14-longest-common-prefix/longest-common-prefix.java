class Solution {
    public String longestCommonPrefix(String[] strs) {
         String output = "";
        int len = strs[0].length();

        for (int i =0;i<len;i++){
            for (int j =1;j< strs.length;j++){
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return output;
                }
            }

            output+=strs[0].charAt(i);

            }

        return output;
    }
}