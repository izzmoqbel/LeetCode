class Solution {
    public boolean canJump(int[] nums) {
        int jump =nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=jump){
                jump=i;
            }
        }
        if (jump==0){
            return true;

        }
        else{
            return false;
        }
    }
}