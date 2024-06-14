package com.company;
import java.util.Locale;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Enter your  number: ");
    int a = scanner.nextInt();
    int a1 = a / 100000%10;
    int a2 = a / 10000%10;
    int a3 = a / 1000%10;
    int a4 = a / 100%10;
    int a5 = a / 10%10;
    int a6 = a %10;
    int sum1 = a1+a2+a3;
    int sum2 = a4+a5+a6;
    if (sum1 == sum2) {
        System.out.println("Yes");        } else {
        System.out.println("No");        }
    scanner.close();
}}