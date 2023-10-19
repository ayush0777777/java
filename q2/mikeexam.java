package endterm.q2;

import java.util.Scanner;

public class mikeexam {
    public static int solve(int arr[],int index,int n,int k){
        if(index>=n && k!=0){
            return 0;
        }
        if(k==0){
            return 1;
        }

        return solve(arr,index+1,n,k)+solve(arr,index+1,n,k+arr[index])+solve(arr,index+1,n,k-arr[index]);

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int k=scan.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            System.out.println(solve(arr,0,n,k));
        }
    }
}
