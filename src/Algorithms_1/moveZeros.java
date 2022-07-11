package Algorithms_1;

public class moveZeros {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if(nums[i]!=0)
                continue;
            int j = i+1;
            while (j<length&&nums[j]==0){
                j++;
            }
            if(j<length&&nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args){
        moveZeros mz = new moveZeros();
        mz.moveZeroes(new int[]{0,1,0,3,12});

    }
}
