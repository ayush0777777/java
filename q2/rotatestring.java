package endterm.q2;

import java.util.Scanner;

public class rotatestring {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        int k=scan.nextInt();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<a.length();i++){
            int index=(i+k)%a.length();
            b.append(a.charAt(index));
        }
        System.out.println(b);
        System.out.println(b.reverse());

    }
}
