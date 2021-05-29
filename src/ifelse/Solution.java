package ifelse;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String ans = "";

        if (N%2 == 1 || N%2 == 0 && N> 5 && N<20){
            ans = "Weird";
        }else {
            if (N%2 == 0 && N>1 && N<6 || N>20){
                ans = "Not Weird";
            }
        }

        System.out.println(ans);
        scanner.close();

    }
}
