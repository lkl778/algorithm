package com.lkl.leetcode.array;

/**
 * @author likelong
 * @date 2022/10/22
 */
public class sub283 {
    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[j++] = 0;
        }

    }
}
