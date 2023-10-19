package endterm.q2;
import java.util.*;
public class pdf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<String>list=new ArrayList<>();
        ArrayList<String>last=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scan.next());
        }
        String ans= scan.next();
        int count=0;
        for(int i=0;i<n;i++){
           if(list.get(i).compareTo(ans)>0){
               last.add(list.get(i));
           }
        }
        System.out.println(last);
    }
}
