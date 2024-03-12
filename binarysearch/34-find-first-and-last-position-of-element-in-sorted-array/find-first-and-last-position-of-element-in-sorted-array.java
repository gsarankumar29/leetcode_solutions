class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]ans = {-1,-1};
        int start = helper(nums, target, true);
        int end = helper(nums, target, false);

        ans[0] =  start;
        ans[1]= end;
        
        return ans;

    }
       int helper(int[] nums , int target, boolean findindex ){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int m = start + (end - start)/2;
            if(target < nums[m] ){
                end = m -1;
            }else if(target > nums[m]){
                start = m +1;
            }else{
                ans = m;
                if(findindex){
                    end = m -1;
                }else{
                    start = m +1;
                }

            }
        }
        return ans;
    }
}