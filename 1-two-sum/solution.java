// Two Sum
// Difficulty: Easy
// Runtime: 50 ms
// Memory: 47 MB
// https://leetcode.com/problems/two-sum/

import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
       
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("Indexes are "+i+"and"+j);
                    return new int[]{i,j};
                }
                
            }
            
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int nums[] = new int[]{3,2,4};
        int[] result = twoSum(nums,target);

    }
}
