import java.util.*;

class Solution {

    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                ans.add(i);
            }
        }

        return ans;
    }
}