package com.company;
import java.util.*;


public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number you want to print the reverse of");
        int n = sc.nextInt();
        int r,s=0;
        while(n!=0){
             r = n%10;
            s = s*10+r;
            n = n/10;

        }
        System.out.println(s);
    }
}
