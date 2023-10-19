package endterm.q2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class tripellinkedlist {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        LinkedList<Integer>list1=new LinkedList<>();
        LinkedList<Integer>list2=new LinkedList<>();
        LinkedList<Integer>list3=new LinkedList<>();
        for(int i=0;i<n1;i++){
            list1.add(scan.nextInt());
        }
        for(int i=0;i<n2;i++){
            list2.add(scan.nextInt());
        }
        for(int i=0;i<n3;i++){
            list3.add(scan.nextInt());
        }
        int target=scan.nextInt();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n3;k++){
                    if(list1.get(i)+list2.get(j)+list3.get(k)==target){
                        a.add(list1.get(i));
                        a.add(list2.get(j));
                        a.add(list3.get(k));
                        break;
                    }
                }
            }
        }
        System.out.println(a);
    }
}
