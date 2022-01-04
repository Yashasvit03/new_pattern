package com.company;

import java.util.*;

class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        //outer main loops which show number of rows
        for (int i = 1;i<=5;i++){
            //spaces_1
            for (int spaces = 1;spaces<=n-i;spaces++){
                System.out.print(" ");
            }
            //number first half
            for (int numbers = i;numbers>=1;numbers--){
                System.out.print(numbers);
            }
            //numbers second half
            for (int numbers = 2;numbers<=i;numbers++){
                System.out.print(numbers);
            }
            System.out.println();
        }
    }
}
