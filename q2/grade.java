package endterm.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        char ans[][]=new char[a][10];
        for(int i=0;i<a;i++){
            for(int j=0;j<10;j++){
               char c=scan.next().charAt(0);
               ans[i][j]=c;
            }
        }
        for(char [] ch:ans){
            System.out.println(Arrays.toString(ch));
        }
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<a;i++){
            int score=0;
            for(int j=0;j<10;j++){
                if(ans[i][j]==keys[j]){
                    score++;
                }
            }
            temp.add(score);
        }
        System.out.println(temp);


    }
}
