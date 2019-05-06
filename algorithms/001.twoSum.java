// Source : https://leetcode.com/problems/two-sum/
// Author : Zhonghuan Gao
// Date   : 2019-05-06

/********************************************************************************** 
*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*               
***********************************************************************************/

class Solution {
    /**
     * 解法一：暴力法
     * 双层循环每两个不同元素相加的值与target比较
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for (int i = 0, len = nums.length; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j && nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }

        return new int[2];
    }

    /**
     * 解法二：哈希表
     * 利用map储存每个数组元素的值和索引，当target减掉当前数组元素的值在哈希表中存在的话，
     * 得出两个数组元素相加等于target，最后返回两个元素在数组中的索引
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

        for (int i = 0, len = nums.length; i < len; i++) {
            if (mp.containsKey(target - nums[i])) {
                return new int[]{mp.get(target - nums[i]), i};                                                                  
            }
            mp.put(nums[i], i);
        }

        return new int[2];
    }
}
