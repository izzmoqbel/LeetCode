class Solution {
    public int jump(int[] nums) {
        int len=nums.length;

        if(len<=1) return 0;

        int jump=0,maxJump=0,maxPoint=0;
       



        for (int i=0;i<len;i++){
            maxPoint=Math.max(maxPoint,i+nums[i]);

            if (i==maxJump) {
                jump++;
                maxJump = maxPoint;

            }
                if (maxJump == len - 1) {
                    break;
                }

        }



        return jump;
    }
}