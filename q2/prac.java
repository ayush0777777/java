package endterm.q2;

import java.util.Scanner;

public class prac {
    public static boolean ispalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
       int count=0;
       int number=1;
       while(count<a){
           if(ispalindrome(Integer.toBinaryString(number))){
               count++;
           }
           number++;
       }
       System.out.println(number-1);
    }
}
