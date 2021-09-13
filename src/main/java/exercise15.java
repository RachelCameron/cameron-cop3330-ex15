/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the password?");
        String password = input.nextLine();
        if(password.equals("abc$123"))
            System.out.printf("Welcome!");
            else
                System.out.printf("I don't know you.");
    }
}