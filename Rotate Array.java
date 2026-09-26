class Solution {
       public void rotate(int[] nums, int k) {
      int start = 0; 
       k = k % nums.length; 
       int end = nums.length - 1; 

       reverse(nums, start, end - k); 
       reverse(nums, nums.length - k, end); 
       reverse(nums, start, end); 
   }

   public void reverse(int[] nums, int start, int end) {
       while (start < end) {
           nums[start] ^= nums[end];
           nums[end] ^= nums[start];
           nums[start++] ^= nums[end--];
       }
   }

}
