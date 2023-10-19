package endterm.q2;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequence {
    public static void subseq(String up,String p,ArrayList<String>ans){
        if(up.length()==0){
            ans.add(p);
            return;
        }

        subseq(up.substring(1),p,ans);
        subseq(up.substring(1),p+up.charAt(0),ans);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.next();

        ArrayList<String> ans=new ArrayList<>();
        subseq(a,"",ans);
        System.out.println(ans);
    }
}
