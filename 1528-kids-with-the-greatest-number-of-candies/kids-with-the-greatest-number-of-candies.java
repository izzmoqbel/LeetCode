class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         int len =candies.length;
        int max = candies[0];

        ArrayList<Boolean> answer = new ArrayList<>();

        for (int i=1;i<len;i++){
            if (candies[i]>max) max=candies[i];
        }


        for (int i=0;i<len;i++){
            if (candies[i]+extraCandies>=max){
                answer.add(true);
            }
            else answer.add(false);
        }

        return answer;
    }
}