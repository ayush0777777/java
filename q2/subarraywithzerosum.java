package endterm.q2;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class subarraywithzerosum {
    public static List<List<Integer>> count(int[]arr){
        int ans=0;
        int n=arr.length;
        List<List<Integer>>temp=new ArrayList<>();
        Map<Integer, List<Integer>> prefixSumMap = new HashMap<>();
        int presum=0;
        for(int i=0;i<arr.length;i++){
            presum+=arr[i];
            if(presum==0){
              temp.add(makeList(arr,0,i));
            }
            if(prefixSumMap.containsKey(presum)){
                List<Integer>a=prefixSumMap.get(presum);
                for(int index: a){
                    temp.add(makeList(arr,index+1,i));
                }
            }
            else{
                prefixSumMap.put(presum,new ArrayList<>());
            }
            prefixSumMap.get(presum).add(i);
        }
        return temp;
    }
    public static List<Integer>makeList(int []arr, int start,int end){
        List<Integer>ans=new ArrayList<>();
        for(int i=start;i<=end;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(count(arr));

    }
}
