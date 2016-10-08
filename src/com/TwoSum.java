package com;

/**
 * Created by guoyu on 10/7/2016.
 */
public class TwoSum {

    public static void main(String arg[]){
        int nums[] = {3,2,4};
        int target = 6;
        int result[] = twoSum(nums,target);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        System.out.println(nums.length);
        for(int i  = 0; i<nums.length;i++){
            for(int j = i+1; j<nums.length; j++){
                if((nums[i]+nums[j])== target){
                    int result[] = {i,j};
                    return result;
                }
            }
        }
        int result[] = {};
        return result;
    }
}
