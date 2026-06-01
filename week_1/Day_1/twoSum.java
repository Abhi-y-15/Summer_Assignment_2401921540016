class solution {
    public int[] twosum(int[]nums ,int target){
        int[] ans = new int[2] ;
        for(int i = 0;i < nums.length-1 ;i++){
            ans[0] = nums[i];
            for(int j = i+1 ;i<nums.length ;i++){
                if(nums[j] == target - nums[i]){
                    ans[1] = nums[j] ;
                    return ans ;
                }
            }
        }
        return ans;
    }
}


