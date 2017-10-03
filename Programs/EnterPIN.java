// Sonny Li
// CMP 167: Programming Methods I

import java.util.Scanner;

public class EnterPIN {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("=============================");
        System.out.println("WELCOME TO THE BANK OF LEHMAN");
        System.out.println("=============================\n");

        System.out.print("Enter your PIN: ");

        int entry = keyboard.nextInt();

        while (entry != pin)
        {

            System.out.println("\nIncorrect. Please try again.");
            System.out.print("Enter your PIN: ");

            entry = keyboard.nextInt();

        }

        System.out.println("\nPIN accepted. You now have access to your account.");

    }

}
