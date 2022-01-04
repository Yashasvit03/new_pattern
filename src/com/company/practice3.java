package com.company;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0, r = 0;
        int p = n;
        while (n != 0) {
            r = n % 10;
            sum = sum * 10+ r;
            n = n / 10;
        }
        if (p==sum) {
            System.out.println("Number is a palindrome number ");
        }
        else{
            System.out.println("Number is not a palindrome number");

        }
    }
}