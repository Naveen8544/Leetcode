class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int actuaSum = 0;
        for (int i = 0; i <= n; i++) {
            totalSum =totalSum^i;
        }
        for (int i = 0; i < n; i++) {
            actuaSum =actuaSum ^ nums[i];
        }
        return totalSum ^ actuaSum;
    }
}
