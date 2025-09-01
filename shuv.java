import java.util.Scanner; // Import the Scanner class from the java.util library

public class SimpleLibraryProgram {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inputScanner = new Scanner(System.in); 

        // Prompt the user for their name
        System.out.print("Please enter your name: ");

        // Read the user's input (a line of text)
        String userName = inputScanner.nextLine(); 

        // Print a greeting using the entered name
        System.out.println("Hello, " + userName + "!");

        // Close the scanner to release system resources
        inputScanner.close(); 
    }
}s