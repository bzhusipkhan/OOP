package com.company;

import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the m: ");
        int m = scanner.nextInt();

        double step = 0.5;
        for (double x = n; x <= m; x += step) {
            double y = -2.4 * Math.pow(x, 2) + 5 * x - 3;
            System.out.printf("%.1f\t %.2f\n", x, y);
        }

        scanner.close();
    }
}

