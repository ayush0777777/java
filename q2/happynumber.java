package endterm.q2;

import java.util.Arrays;
import java.util.Scanner;

public class happynumber {
    public static int findLargestNumber(int N) {
        // Convert N to a string to work with individual digits
      String strN = Integer.toString(N);
        int n = strN.length();

          // Convert the string to an array of digits
        char[] digits = strN.toCharArray();
        for(int i=n-2;i>=0;i--){
            if(digits[i]>digits[i+1]){
                digits[i]--;
                for(int j=i+1;j<n;j++){
                    digits[j]='9';
                }
            }
        }
        // Traverse the digits from right to left


//        for (int i = n - 2; i >= 0; i--) {
//            if (digits[i] > digits[i + 1]) {
//                // Decrease the current digit and set all digits to the right to 9
//                digits[i]--;
//                for (int j = i + 1; j < n; j++) {
//                    digits[j] = '9';
//                }
//            }
//        }

        // Convert the modified array back to an integer
        return Integer.parseInt(new String(digits));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println(findLargestNumber(a));

//        int flag=0;
//        while(flag!=1){
//            String ans=a+"";
//            char[] ch=ans.toCharArray();
//            Arrays.sort(ch);
//            String v=new String(ch);
//            int b=Integer.parseInt(v);
//            if(a==b){
//                System.out.println(b);
//                flag=1;
//            }
//            a--;
//        }

    }
}
