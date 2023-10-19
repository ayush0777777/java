package endterm.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class makequal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
           while(arr[i]%2==0){
               arr[i]=arr[i]/2;
           }
           while(arr[i]%3==0){
               arr[i]=arr[i]/3;
           }
        }
        int ans=arr[0];
        for(int i=0;i<n;i++){
            if(ans!=arr[i]){
                System.out.println("notequal");
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("equal");
    }
}
