package endterm.q2;

import java.util.Scanner;

public class reversewithspace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder ans=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                ans.append(str.charAt(i));
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                ans.insert(i,' ');
            }
        }
        System.out.println(ans);

    }
}
