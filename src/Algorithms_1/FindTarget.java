package Algorithms_1;

import java.util.Arrays;

public class FindTarget {
    public int search_helper(int[] nums, int target,int added_value) {
        int mid = nums.length>>1;
        if(nums[mid]==target){
            return mid+added_value;
        }
        if(mid == 0 && nums[mid]>target){
            return mid+added_value;
        }
        if(mid == nums.length-1 && nums[mid]<target){
            return nums.length+added_value;
        }
        if (nums[mid]>target){
            nums = Arrays.copyOfRange(nums,0,mid);
            return search_helper(nums,target,added_value);
        }
        if(nums[mid]<target){
            nums = Arrays.copyOfRange(nums,mid,nums.length);
            return search_helper(nums,target,mid+added_value);
        }

        return -1;
    }
    public int searchInsert(int[] nums, int target) {
        return search_helper(nums,target,0);
    }
    public static void main(String[] args){
        FindTarget FT = new FindTarget();
        System.out.println(FT.searchInsert(new int[]{1,3,4,6},7));

    }
}
