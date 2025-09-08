class Solution {
    public void sortColors(int[] nums) {
        int l = 0, i = 0, r = nums.length - 1;
        while (i <= r) {
            if (nums[i] == 0) swap(nums, l++, i++);
            else if (nums[i] == 2) swap(nums, i, r--);
            else i++;
        }
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
