package endterm.q2;

import java.util.Scanner;

public class contact {
    static class  Contact{
        String name;
        String number;
        String email;
        Contact(String name, String number,String email){
            this.name=name;
            this.number=number;
            this.email=email;
        }

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        Contact arr[]=new Contact[n];
        for(int i=0;i<n;i++){
            arr[i]=new Contact(scan.next(),scan.next(),scan.next());
        }
        String search=scan.next();
        for(int i=0;i<arr.length;i++){
            if(search.compareTo(arr[i].name)==0){
                System.out.println(arr[i].name);
                System.out.println(arr[i].number);
                System.out.println(arr[i].email);
                break;
            }
        }

    }
}
