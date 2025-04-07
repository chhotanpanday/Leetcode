class Solution {
    public int maxOperations(int[] nums, int k) {
       Arrays.sort(nums);
       int l = 0;
       int n = nums.length;
       int r = n-1;
       int count =0;

       while(l < r){
        if(nums[l] + nums[r] < k){
           l++;
        } else if(nums[l] + nums[r] > k){
            r--;
        } else{
           l++;
           r--;
           count++;
        }
       } 
       return count;
    }
}