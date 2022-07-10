package Algorithms_1;

public class twoSum {
    public int[] generate(int x , int y ){
        return new int[]{x+1,y+1};

    }
    public int[] twoSum(int[] numbers, int target) {

        int right_pointer = numbers.length-1;
        int left_pointer  = 0;
        while (right_pointer>left_pointer){
            int sum = numbers[right_pointer]+numbers[left_pointer];
            if(sum==target){
                return generate(left_pointer,right_pointer);
            }
            if(sum>target)
                right_pointer--;
            if (sum<target)
                left_pointer++;
        }

        return new int[]{-1,-1};
    }
}
