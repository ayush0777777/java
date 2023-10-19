package endterm.q2;

import java.util.ArrayList;
import java.util.Scanner;

public class madhavhouses {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        ArrayList<Integer>ans=new ArrayList<>();
        int count=1;
        while(true){
            int temp=(3*count)+2;
            if(temp%m!=0){
                ans.add(temp);
                n--;
            }
            count++;
            if(n==0){
                break;
            }
        }
        System.out.println(ans);

    }
}
