package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Name");

        System.out.print("First Name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Middle Initial: ");
        String middleInitial = scanner.nextLine().trim();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        if (!middleInitial.isEmpty()) {
            fullName += " " + middleInitial;
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;


        }
        System.out.println("Full Name: " + fullName);


    }
}
