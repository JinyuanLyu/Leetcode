/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            sum=nums[i]+nums[j];
            if(sum==target){return new int[] { i, j };}
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

//很简单的一道题，但是我最后提交的时候反复提示错误，最后发现是自己第八行的target拼错了。。。。
