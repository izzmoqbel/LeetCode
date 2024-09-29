class Solution {
    public int longestConsecutive(int[] nums) {
           int currCount=1,count=0;
        int len =nums.length;

        Arrays.sort(nums);

        if(len==0) return 0;


        for (int i=1;i<len;i++){
//            System.out.println(i+" : "+ nums[i]);
            if (nums[i] == nums[i-1]+1){
                currCount++;
            } else if (nums[i] == nums[i-1]) {
                    continue;
            }else{
                   count=Math.max(currCount,count);
                currCount=1;
            }
        }


        return Math.max(currCount,count);

    }
}