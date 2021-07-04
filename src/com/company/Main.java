package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n, n1 = 1, n2 = 1, next = 0, i;
        System.out.print("Enter the position you want: ");
        n = scanner.nextInt();
        if(n == 0 || n == 1)
            System.out.println(n);
        else
            next = n1 + n2;
        for (i = 3; i <= n; ++i)
        {
            n1 = n2;
            n2 = next;
            next = n1 + n2;
        }
        System.out.println(n2);
    }
}