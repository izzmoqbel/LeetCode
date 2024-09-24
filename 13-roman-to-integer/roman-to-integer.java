class Solution {
    public int romanToInt(String s) {

        int answer=0;
        int prev=0;
        int len = s.length();

        for (int i=len-1;i>=0;i--){
            int curr=0;

            char roman =s.charAt(i);
            if (roman == 'I'){
                curr=1;
            } else if (roman=='V') {
                curr=5;
            } else if (roman=='X') {
                curr=10;
            } else if (roman=='L') {
                curr=50;
            } else if (roman== 'C') {
                curr=100;
            } else if (roman=='D') {
                curr=500;
            } else if (roman=='M') {
                curr=1000;
            }

            if (curr<prev){
                answer-=curr;
            } else {
                answer+=curr;
            }

            prev=curr;

        }



        return answer;



    }
}