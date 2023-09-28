//2. Write a program to Menu driven program using switch statement ( Find addition, subtraction, multiplication and division of to integer numbers ).//

package com.project.api;

import java.util.Scanner;
public class MenuCal
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int a,b,ch;
 
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Select your Choice(1-4) : ");
        ch = input.nextInt();
 
        switch(ch)
        {
            case 1:
                System.out.print("Enter the First Number  :");
                a=input.nextInt();
                System.out.print("Enter the Second Number :");
                b=input.nextInt();
                System.out.print("Addition = " + (a+b));
                break;
            case 2:
                System.out.print("Enter the First Number  :");
                a=input.nextInt();
                System.out.print("Enter the Second Number :");
                b=input.nextInt();
                System.out.print("Subtraction = " + (a-b));
                break;
            case 3:
                System.out.print("Enter the First Number :");
                a=input.nextInt();
                System.out.print("Enter the Second Number :");
                b=input.nextInt();
                System.out.print("Multiplication = " + (a*b));
                break;
            case 4:
                System.out.print("Enter the First Number :");
                a=input.nextInt();
                System.out.print("Enter the Second Number:");
                b=input.nextInt();
                System.out.print("Division = " + (a/b));
                break;
            default:
                System.out.print("Invalid Choice...Please Try Again !!!");
        }
    }
}
 
