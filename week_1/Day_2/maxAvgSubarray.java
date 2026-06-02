class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j =0;
        int cSum = 0;
        while(j<k){
            cSum = cSum+nums[j++];   
        }
        int maxSum = cSum;
        for(int i = 1;i<=nums.length-k ;i++){
            cSum = cSum - nums[i-1];
            cSum = cSum+nums[i+k-1] ;
            maxSum = Math.max(cSum , maxSum);
        }
        double avg = (double)maxSum/k;
        return avg ;
    }
}
