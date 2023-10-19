package endterm.q2;

import java.util.Scanner;

public class bitmanipulation {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(findpermutatioan(n));
    }


    public static int findpermutatioan(int n) {
        int count=0;
        int number=1;
        while(count<n){
            if(ispermutation(Integer.toBinaryString(number))){
                count++;
            }
            number++;
        }
        return number-1;
    }
    public static boolean ispermutation(String s){
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
}
