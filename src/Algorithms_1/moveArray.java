package Algorithms_1;

import java.util.ArrayList;
import java.util.Arrays;

public class moveArray {
    public void rotate(int[] nums, int k) {
        if(k>nums.length) k = k% nums.length;

        int[] temp1 =  Arrays.copyOfRange(nums,nums.length-k,nums.length);
        int[] temp2 =  Arrays.copyOfRange(nums,0,nums.length-k);
        System.arraycopy(temp1, 0, nums, 0, temp1.length);
        System.arraycopy(temp2, 0, nums,  k, temp2.length);
        for(int num:nums){System.out.print(num+" ");}
    }
    public static void main(String[] args){
        moveArray ma = new moveArray();
        ma.rotate(new int[]{-1},2);
//        System.out.println(1%2);
    }
}

