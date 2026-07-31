import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == mid) {
                // Missing number is on the right
                left = mid + 1;
            } else {
                // Missing number is on the left
                right = mid - 1;
            }
        }

        return left;
    }
}