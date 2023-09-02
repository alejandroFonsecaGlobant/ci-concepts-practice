package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        WindowsEnvironment windowsEnv = new WindowsEnvironment();
        UserEnvironment userEnv = new UserEnvironment();
        System.out.println("Your OS is: " + windowsEnv.getOs());
        System.out.println("Your computer name is: " + windowsEnv.getComputerName());
        System.out.println("Your user domain is: " + userEnv.getUserDomain());
        System.out.println("Your username is: " + userEnv.getUsername());
    }
}
