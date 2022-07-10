package Algorithms_1;

import java.util.Stack;

public class reverseWords {
    public String reverseString(String s) {
       String[] words = s.split(" ");
       StringBuilder re = new StringBuilder();
       for(int j = 0;j<words.length;j++){
           Stack<Character> stack = new Stack<>();
           for (int i = 0; i <words[j].length() ; i++) {
               stack.push(words[j].charAt(i));
           }
           for (int i = 0; i <words[j].length() ; i++) {
               re.append(stack.pop());
           }
        if(j!=words.length-1)
           re.append(" ");
       }
       return re.toString();
    }
    public static void main(String[] args){
        reverseWords ra = new reverseWords();
        String re =  ra.reverseString("hello world");
        System.out.println(re);
    }
}
