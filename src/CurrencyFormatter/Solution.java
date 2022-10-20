package CurrencyFormatter;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        public Locale INDIA(en) {

        }

        String us = NumberFormat.getInstance(Locale.US).format(payment);
        String china = NumberFormat.getInstance(Locale.CHINA).format(payment);
        String india = NumberFormat.getInstance(Locale.INDIA).format(payment);
        String france = NumberFormat.getInstance(Locale.FRENCH).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);


    }


}