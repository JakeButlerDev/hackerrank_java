package JavaDatatypes;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner keyboard = new Scanner(System.in);

        long amount = keyboard.nextLong();

        for (int i = 0; i < amount; i++) {
            try {
                long n = keyboard.nextLong();
                System.out.println(n + " can be fitted in:");
                if (n <= 127 && n >=-128) {
                    System.out.println("* byte");
                } if (n <= 32767 && n >= -32768) {
                    System.out.println("* short");
                } if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                } if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            }
            catch (Exception e) {
                System.out.println(keyboard.next() + " can't be fitted anywhere.");
            }
        }
    }
}