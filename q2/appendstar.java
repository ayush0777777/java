package endterm.q2;

import java.util.ArrayList;
import java.util.Scanner;

public class appendstar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.next();

        ArrayList<Integer>arr=new ArrayList<>();
        while(scan.hasNext()){
            arr.add(scan.nextInt());
        }
        StringBuilder ans=new StringBuilder();
        ans.append(a);
        int count=0;
        for(int i=0;i<arr.size();i++){
            ans.insert(arr.get(i)+count,"*");
            count++;
        }
        System.out.println(ans);

    }
}
