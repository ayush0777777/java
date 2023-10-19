package endterm.q2;

import java.util.HashMap;
import java.util.Scanner;

public class gooddsubarrayyyy {
    public static int atmost(int []arr,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        int j=0;
        int count=0;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            while(map.size()>k && j<n){
                map.put(arr[j],map.get(arr[j])-1);
                if(map.get(arr[j])==0){
                    map.remove(arr[j]);
                }
                j++;
            }
            count+=(i-j+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int k= scan.nextInt();
        int ans=atmost(arr,k)-atmost(arr,k-1);
        System.out.println(ans);
    }
}
