package endterm.q2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class longeststring {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int value=scan.nextInt();
        int fresh[]=new int[n];
        int cost[]=new int[n];
        for(int i=0;i<n;i++){
            fresh[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++){
            cost[i]= scan.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(fresh[i]>=value){
                ans+=cost[i];
            }
        }
        System.out.println(ans);
//        ArrayList<String>ans=new ArrayList<>();
//        while(scan.hasNext()){
//            ans.add(scan.next());
//        }
//        System.out.println(ans);
    }
}
