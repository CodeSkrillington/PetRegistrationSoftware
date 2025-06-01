/*
Jesse Singleton
5/29/2025
CS 123
 */

import java.util.Scanner;
public class InputValidator 
{

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    //Input validation methods for ints
    public static int getIntInput(Scanner scanner, int max) 
    {
        int result;
        while (true)
        {
            if (scanner.hasNextInt())
            {
                result = scanner.nextInt();
                scanner.nextLine();

                if (result < 1 || result > max)
                {
                    System.out.print(RED + "Invalid selection. Please try " +
                    "again: " + RESET);
                    continue; // prompt again
                }
                else
                {
                    return result; // valid input
                }
            }
            else
            {
                System.out.print(RED + "Invalid input. Please enter a valid " +
                "integer: " + RESET);
                scanner.nextLine(); // discard invalid input
            }
        }
    }
    //Input validation methods for doubles
    public static double getDoubleInput(Scanner scanner, double max) 
    {
        double resultDouble;
        while (true)
        {
            if (scanner.hasNextDouble())
            {
                resultDouble = scanner.nextDouble();
                scanner.nextLine();

                if (resultDouble < 0 || resultDouble > max)
                {
                    System.out.print(RED + "Invalid selection. Please try " +
                    "again: " + RESET);
                    continue; // prompt again
                }
                else
                {
                    return resultDouble; // valid input
                }
            }
            else
            {
                System.out.print(RED + "Invalid input. Please enter a valid " +
                "integer: " + RESET);
                scanner.nextLine(); // discard invalid input
            }
        }
    }
}

