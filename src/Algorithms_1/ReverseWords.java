package Algorithms_1;

public class ReverseWords {
    public void reverseString(char[] s) {
        int left_pointer = 0;
        int right_pointer = s.length-1;
        while (left_pointer<right_pointer){
            char temp = s[right_pointer];
            s[right_pointer] = s[left_pointer];
            s[left_pointer] = temp;
            left_pointer++;
            right_pointer--;
        }
        for (char c :s){
            System.out.print(c);
        }
    }
    public static void main(String[] args){
        ReverseWords ra = new ReverseWords();
        ra.reverseString(new char[]{'h','e','l','l','o'});
    }
}
