package com.company;

import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an n: ");
        int n = scanner.nextInt();


        double sum = 0.0;
        int pm = 1;

        for (int i = 1; i <= n; i ++) {
            double sum1 = 1.0 / (i * 2 - 1);
            sum += pm * sum1;
            pm = -pm;
        }

        System.out.println(sum);

        scanner.close();
    }
}