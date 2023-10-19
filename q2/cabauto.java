package endterm.q2;

import java.util.Scanner;

public class cabauto {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int c1=scan.nextInt();
            int c2=scan.nextInt();
            int c3=scan.nextInt();
            int c4=scan.nextInt();
            int noauto=scan.nextInt();
            int norick=scan.nextInt();
            int auto[]=new int[noauto];
            int rick[]=new int[norick];
            for(int i=0;i<noauto;i++){
                auto[i]=scan.nextInt();
            }
            for(int i=0;i<norick;i++){
                rick[i]=scan.nextInt();
            }
            int toatalauto=0;
            for(int i=0;i<noauto;i++){
                toatalauto+=Math.min(auto[i],c2);
            }
            toatalauto=Math.min(toatalauto,c3);

            int totalbus=0;
            for(int i=0;i<norick;i++){
                totalbus+=Math.min(rick[i],c3);
            }
            totalbus=Math.min(totalbus,c3);

            int ans=Math.min(totalbus+toatalauto,c4);
            System.out.println(ans);
        }
    }
}
