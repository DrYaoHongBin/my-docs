import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer j = hash.get(target - nums[i]);
            if (j == null) {
                hash.put(nums[i], i);
            } else {
                result[0] = j;
                result[1] = i;
                return result;
            }
        }
        return result;
    }
}
// @lc code=end

