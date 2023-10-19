package endterm.q2;

import java.util.Scanner;

public class alicebob {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int alice[]=new int[n];
        int bob[]=new int[n];
        for(int i=0;i<n;i++){
            alice[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++){
            bob[i]= scan.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(alice[i]%bob[i]<2 && bob[i]%alice[i]<2){
                count++;
            }
        }
        System.out.println(count);
    }
}
