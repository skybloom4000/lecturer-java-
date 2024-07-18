package java_methods;

import java.util.Scanner;

public class Lecturer {
    public static void calculateAverageMarks() {
        try ( // Create a Scanner object to read user input
                Scanner scanner = new Scanner(System.in) // Close the Scanner object
        ) {
            // Prompt the lecturer to enter marks for each subject
            System.out.print("Enter marks for Java Programming: ");
            double javaMarks = scanner.nextDouble();

            System.out.print("Enter marks for Networking: ");
            double networkingMarks = scanner.nextDouble();

            System.out.print("Enter marks for Maths: ");
            double mathsMarks = scanner.nextDouble();

            // Calculate the total marks
            double totalMarks = javaMarks + networkingMarks + mathsMarks;

            // Calculate the average marks
            double averageMarks = totalMarks / 3;

            // Print the marks for each subject
            System.out.println("Marks for Java Programming is: " + javaMarks);
            System.out.println("Marks for Networking is: " + networkingMarks);
            System.out.println("Marks for Maths is: " + mathsMarks);

            // Print the average marks
            System.out.printf("The average is: %.2f%n", averageMarks);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values for marks.");
        }
    }

    public static void main(String[] args) {
        calculateAverageMarks();
    }
}

