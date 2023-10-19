package endterm.q2;

import java.util.Scanner;

public class productpair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder ans=new StringBuilder();
        int index=0;
        while(index<str.length()){
            if(index==str.length()-1){
                ans.append(str.charAt(index));
                break;
            }
            char ch1=str.charAt(index);
            char ch2=str.charAt(index+1);
            if(ch1>ch2){
                ans.append(ch1);
            }
            else {
                ans.append(ch2);
            }
            index+=2;
        }
        System.out.println(ans);
    }
}
