package Algorithms_1;

import java.util.Arrays;

public class BinarySearch {
    public int search_helper(int[] nums, int target,int added_value) {
        int mid = nums.length>>1;
        if(nums[mid]==target){
            return mid+added_value;
        }
        if(mid == 0 && nums[mid]>target){
            return -1;
        }
        if(mid == nums.length-1 && nums[mid]<target){
            return -1;
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
    public int search(int[] nums, int target) {
        return search_helper(nums,target,0);
    }
    public int firstBadVersion(int n) {
        long mid = n>>1;
        long start =0 ;
        long end = n;

        while (start!=end){
            if(isBadVersion((int)mid)&&!isBadVersion((int)mid-1)){
                return (int)mid;
            }
            if(!isBadVersion((int)mid)&&isBadVersion((int)mid+1)) {
                return (int)mid+1;
            }
            if(isBadVersion((int)mid)&&isBadVersion((int)mid-1)){
                end = mid;
                mid = (start+end)>>1;
            }
            if(!isBadVersion((int)mid)&&!isBadVersion((int)mid+1)){
                start = mid;
                mid = (start+end)>>1;
            }
        }
        return -1;

    }
    Boolean isBadVersion(long num){
        return num>=1702766719;
    }

    public static void main(String[] args){
        BinarySearch BS = new BinarySearch();
        System.out.println(BS.firstBadVersion(
                2126753390));

    }
}
