package endterm.q2;
import java.util.*;
public class findoccurence {
    public static List<Integer>ans(String large,String target){
        int index=large.indexOf(target);
        List<Integer>temp=new ArrayList<>();
        while(index!=-1){
            temp.add(index);
            index=large.indexOf(target,index+1);
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String largerText = scanner.nextLine();
        String target = scanner.nextLine();

        // Find and store the positions of occurrences
        List<Integer> occurrences = ans(largerText, target);
        System.out.println(occurrences);
    }
}
