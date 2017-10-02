// Jeffrey Matthew & Justin Acosta
// Rock Paper Scissors (The Big Bang Theory)
// https://www.youtube.com/watch?v=cSLeBKT7-sM

/* Hey there! This is the Big Bang Theory version of RPS, which includes Lizard and Spock.
   The idea came from Justin Acosta (teammate), and I was able to write the program.
   Feel free to make changes to the code. */

import java.util.Scanner;

public class RockPaperScissorsLizardSpock {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String user_choice, computer_choice = null;
        int computer = (int) (Math.random() * 5 + 1);

        System.out.println("Welcome to Rock Paper Scissors: Big Bang Theory Edition!\n");
        System.out.println("To play, you will need to type in the following choices:\n");
        System.out.println("  -Rock    -Paper    -Scissors");
        System.out.println("  -Lizard  -Spock\n");

        System.out.print("Enter your move: ");
        user_choice = in.nextLine();

        if (computer == 1)
            computer_choice = "Rock";
       
        if (computer == 2)
            computer_choice = "Paper";
       
        if (computer == 3)
            computer_choice = "Scissors";
       
        if (computer == 4)
            computer_choice = "Lizard";
       
        if (computer == 5)
            computer_choice = "Spock";

        System.out.println("\nComputer chose " + computer_choice + ".\n");

        if (user_choice.equals("Rock")) {

            if (computer == 1)
                System.out.println("You tied!");
           
            if (computer == 2)
                System.out.println("Paper has covered Rock. You lost!");
           
            if (computer == 3)
                System.out.println("Rock crushes Scissors. You won!");
           
            if (computer == 4)
                System.out.println("Rock crushes Lizard. You won!");
           
            if (computer == 5)
                System.out.println("Rock has been vaporized by Spock. You lost!");

        }

        if (user_choice.equals("Paper")) {

            if (computer == 1)
                System.out.println("Paper has covered Rock. You won!");
           
            if (computer == 2)
                System.out.println("You tied!");
           
            if (computer == 3)
                System.out.println("Paper has been cut by Scissors. You lost!");
           
            if (computer == 4)
                System.out.println("Paper has been eaten by Lizard. You lost!");
           
            if (computer == 5)
                System.out.println("Paper has disproved Spock. You won!");

        }

        if (user_choice.equals("Scissors")) {

            if (computer == 1)
                System.out.println("Rock has crushed Scissors. You lost!");
           
            if (computer == 2)
                System.out.println("Scissors has cut Paper. You won!");
           
            if (computer == 3)
                System.out.println("You both tied!");
           
            if (computer == 4)
                System.out.println("Scissors has killed Lizard. You won!");
           
            if (computer == 5)
                System.out.println("Spock has smashed Scissors. You lost!");

        }

        if (user_choice.equals("Lizard")) {

            if (computer == 1)
                System.out.println("Rock has crushed Lizard. You lost!");
           
            if (computer == 2)
                System.out.println("Lizard has eaten Paper. You won!");
           
            if (computer == 3)
                System.out.println("Lizard has been cut by Scissors. You lost!");
           
            if (computer == 4)
                System.out.println("You have tied!");
           
            if (computer == 5)
                System.out.println("Lizard has poisoned Spock. You won!");

        }

        if (user_choice.equals("Spock")) {

            if (computer == 1)
                System.out.println("Rock has been vaporized by Spock. You won!");
           
            if (computer == 2)
                System.out.println("Paper has disproved Spock. You lost!");
           
            if (computer == 3)
                System.out.println("Spock smashes Scissors. You won!");
           
            if (computer == 4)
                System.out.println("Lizard has poisoned Spock. You lost!");
           
            if (computer == 5)
                System.out.println("You tied!");

        }

    }

}
