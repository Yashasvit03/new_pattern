package com.company;

import java.util.Scanner;

public class practice2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0,r = 0; int p = n;
        while(n!=0)
        {
            r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }
        // armstrong number is a type of number whose sum of the cube of its digit is equal to the number
        if (sum == p ) {
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("Number is not an armstrong number");
            }
        }
    }


