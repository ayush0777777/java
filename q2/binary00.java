package endterm.q2;

import java.util.Scanner;
import java.util.Stack;

public class binary00 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(stack.isEmpty()){
                stack.push(str.charAt(i));
            } else if (str.charAt(i)=='0') {
                stack.pop();
            }
            else {
                stack.push(str.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();
        for (char temp:stack) {
            ans.append(temp);
        }

        System.out.println(ans.length());
    }
}
