/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Scanner;

/**
 * Password Validation
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.print("What is the password? ");
        if (user.validate(scanner.nextLine()))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");
    }
}
