// Find First and Last Position of Element in Sorted Array
// Difficulty: Medium
// Runtime: 0 ms
// Memory: 17.5 MB
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

        return{first,last};
    }


private:
    int findbound(vector<int>& nums, int target, 
    bool isFirst){
        int low = 0, high = nums.size() - 1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
