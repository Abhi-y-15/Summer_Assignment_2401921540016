class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 1 ;i<nums.length-1 ;i++){
           int j = i+1;
           while(j>0 && nums[j] < nums[j - 1]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1]= temp;
                j--;
            }
        }
       for(int i = 1 ;i<nums.length ; i++){
          if(nums[i] == nums[i-1]){
            return true;
          }
        }
       return false ;
    }
    
}