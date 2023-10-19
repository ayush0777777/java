package endterm.q2;

import java.util.ArrayList;
import java.util.Scanner;

public class musicserach {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        ArrayList<String>ans=new ArrayList<>();
        while(n-->0){
            ans.add(scan.next());
        }
        String target= scan.next();
        for(int i=0;i<ans.size();i++){
            if(ans.get(i).compareTo(target)==0){
                System.out.println(i);
                break;
            }
        }
        System.out.println(-1);
    }
}
