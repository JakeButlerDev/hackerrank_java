package StringsIntroduction;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        // Step 1
        int sum = A.length() + B.length();
        // Step 2

        // Step 3
        A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
        B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
        // Print 1
        System.out.println(sum);
        // Print 2
        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // Print 3
        System.out.println(A + " " + B);
    }
}
