package com.company;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int number = n;

        while (number > 0) {
            sum += number % 10; // last digit to sum
            number /= 10; // delete last digit
        }

        System.out.println(sum);

        scanner.close();
    }
}
