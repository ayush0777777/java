package endterm.q2;

import java.util.Arrays;
import java.util.Scanner;

public class largestcoin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            str[i]=arr[i]+"";
        }
        Arrays.sort(str,(a,b)->{
          String n1=a+b;
          String n2=b+a;
            System.out.println(a+" "+b+" "+n1.compareTo(n2));
          return n1.compareTo(n2);

        });
        StringBuilder s=new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            s.append(str[i]);
        }
        System.out.println(s);
    }
}
