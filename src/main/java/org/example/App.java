package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        WindowsEnvironment env = new WindowsEnvironment();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the variable you want to print:");
        System.out.println("1. OS");
        System.out.println("2. Computer name");
        int decision = scanner.nextInt();
        if (decision == 1) {
            System.out.println(env.getOs());
        } else if (decision == 2){
            System.out.println(env.getComputerName());
        } else {
            System.out.println("Invalid number. Shutting down...");
        }
    }
}
