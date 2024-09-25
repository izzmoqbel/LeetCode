class Solution {
    public String convert(String s, int numRows) {
        String outPut = "";

        int len = s.length();


        if (numRows == 1) {
            return s;
        }
        char[][] arr = new char[numRows][len];
        int currRow = 0, currCollum = 0 ,currChar = 0;
        boolean flag =false;


        while (currChar < s.length()) {
            if (currRow == 0) {
                flag = false;
            }
            if (currRow == numRows - 1) {
                flag = true;
            }
            if (!flag) {
                arr[currRow][currCollum] = s.charAt(currChar);
                currRow++;
            }
            if (flag) {
                arr[currRow][currCollum] = s.charAt(currChar);
                currRow--;
                currCollum++;
            }

            currChar++;
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '\u0000')
                    continue;
                outPut += arr[i][j];
            }
        }
        return outPut;
    }
}