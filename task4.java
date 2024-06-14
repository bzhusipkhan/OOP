package com.company;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x: " );
        double x = scanner.nextDouble();

        System.out.print("Enter the y: ");
        double y = scanner.nextDouble();


        double func = 5*x*x - 7*x + 2;



        if (y == func) {
            System.out.println("Yes");
        }  else {
            System.out.println("No");
        }


        scanner.close();
    }
}