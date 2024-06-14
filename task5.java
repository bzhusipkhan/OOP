package com.company;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Odds = 0;
        int number;

        System.out.println("Enter integers:");

        do {
            number = scanner.nextInt();


            if (number != 0 && number % 2 != 0) {
                Odds += number;
            }
        } while (number != 0);

        // Output the sum of odd integers
        System.out.println("Sum of odd integers entered: " + Odds);

        scanner.close();
    }
}

