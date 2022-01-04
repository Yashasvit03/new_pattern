package com.company;

import java.util.*;

public class practice1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0,r = 0;
        while(n!=0)
        {
            r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }
        System.out.println("Sum of the digit = " + sum );
    }
    }

