package endterm.q2;

import java.util.Scanner;

public class govinda {
    public static boolean isprime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
            return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int v=n;
        int k=n/2;
        String ans="";
        for(int i=2;i<=k;i++){
            if(n==1){
                break;
            }
            if(isprime(i)){
                while(n%i==0){
                    n=n/i;
                    ans+=i;
                    if(isprime(n)){
                        ans+=n;
                        n=1;
                        break;
                    }
                    if(n==1){
                        break;
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<ans.length();i++){
            count=count+(int) ans.charAt(i)-'0';
        }
        String an2=v+"";
        int count2=0;
        for(int i=0;i<an2.length();i++){
            count2=count2+(int) an2.charAt(i)-'0';
        }
        if(count2==count){
            System.out.println( count2 + " " +count +" "+ "yes");
        }
        else {
            System.out.println("no");
        }

    }
}
