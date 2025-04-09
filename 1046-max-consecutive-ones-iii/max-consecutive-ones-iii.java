class Solution {
    public int longestOnes(int[] nums, int k) {
      int i = 0;
      int j = 0;
      int zero = 0;
      int n = nums.length;

      while(j < n){
        if(nums[j]==0){
           zero++;
        }
        j++;
        if(zero > k){
            if( nums[i]==0){
                zero--;
            }
            i++;
        }
      } 
      return j-i; 
    }
}