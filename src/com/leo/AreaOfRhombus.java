package com.leo;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Enter the length of the first diagonal
        System.out.print("Enter the length of the first diagonal: ");
        double diagonal1 = in.nextDouble(); // reads the input as "double"

        // Enter the length of the second diagonal
        System.out.print("Enter the length of the second diagonal: ");
        double diagonal2 = in.nextDouble(); //reads the input as "double"

        // Area = 0.5 * diagonal1 * diagonal2
        double area = 0.5 * diagonal1 * diagonal2;
        System.out.println("The area of the rhombus is: " + area);

        in.close();

    }
}
