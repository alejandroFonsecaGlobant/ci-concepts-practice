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
        System.out.println("Your OS is: " + env.getOs());
        System.out.println("Your computer name is: " + env.getComputerName());
    }
}
