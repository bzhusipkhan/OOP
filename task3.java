package com.company;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total distance: " );
        int A = scanner.nextInt();

        System.out.print("Enter the t1: ");
        int t1 = scanner.nextInt();

        System.out.print("Enter the t2: ");
        int t2 = scanner.nextInt();

        int d1 = 20;
        int d2 = A - d1;

        double v1 = (double) d1 / t1;
        double v2 = (double) d2 / t2;

        if (v1 > v2) {
            System.out.println("Before");
        } else if (v1 < v2) {
            System.out.println("After");
        } else {
            System.out.println("Equal");
        }


        scanner.close();
    }
}

