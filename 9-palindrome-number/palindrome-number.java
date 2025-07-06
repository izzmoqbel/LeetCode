class Solution {
    public boolean isPalindrome(int x) {
        
        String y = String.valueOf(x);
        System.out.println(y);
        int len = y.length();



        for (int i =0;i<len/2;i++){

            if (y.charAt(i) != y.charAt(len-i-1)) return false;

        }

        return true;
    }
}