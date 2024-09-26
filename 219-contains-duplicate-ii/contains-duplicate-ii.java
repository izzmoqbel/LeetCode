class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> num =new HashMap<Integer,Integer>();
        int len =nums.length;


         for(int i=0;i<len;i++){
            if(num.containsKey(nums[i]) && i-num.get(nums[i])<=k)
            return true;
            else{
                num.put(nums[i],i);
            }
         }
        return false;
    }
}