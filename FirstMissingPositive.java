class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int fmp = 1;

        for (int num : nums) {
            if (num == fmp) {
                fmp++;
            }
        }

        return fmp;
    }
}
