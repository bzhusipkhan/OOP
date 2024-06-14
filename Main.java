package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Enter your first number: ");
    double a = scanner.nextDouble();
    System.out.println("Enter your second number:");
    double b = scanner.nextDouble();
    if (a>b) {
        System.out.println(a + " is greater than " + b);
    } else if (a<b){
        System.out.println(a + " is less than " + b);
    } else {
        System.out.println(a + " is equal to " + b );
        scanner.close();        }
}}