package com.company;

import java.util.Arrays;

public class arrays
{
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4 };
        System.out.println(Arrays.toString(buildArray(nums)));

    }
    static int[] buildArray(int[] nums) {
     int n = nums.length;


    for (int i = 0; i < n; ++i)
        nums[i] += n * (nums[nums[i]] % n);

    for (int i = 0; i < n; ++i)
        nums[i] /= n;

    return nums;
}


}


