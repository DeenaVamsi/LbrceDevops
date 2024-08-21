package application;

import java.util.Scanner;

public class signin{

    // Hard-coded credentials for demonstration purposes
    private static final String USERNAME = "vamsi";
    private static final String PASSWORD = "vamsi";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for username
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        // Prompt for password
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Validate credentials
        if (validateCredentials(inputUsername, inputPassword)) {
            System.out.println("Sign-in successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to validate credentials
    private static boolean validateCredentials(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}

