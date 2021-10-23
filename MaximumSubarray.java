class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int m=0; m<nums.length; m++) {
            sum = Math.max( nums[m], sum+nums[m] );
            max = Math.max( max, sum );
        }
        
        return max;
    }
}
