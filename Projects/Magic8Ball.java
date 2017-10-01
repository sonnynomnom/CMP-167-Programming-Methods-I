// Ginell Rosario & Alex Mayi
// Magic 8-Ball

import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int choice = 1 + r.nextInt(14);

        String name, response = "";

        System.out.println("My name is Derp. I am the Magic 8-Ball.");
        System.out.println("What's your name? ");
        name = in.nextLine();

        System.out.println("\nDo you have a question for me, " + name + "? Ask away!");
        in.nextLine();

        if (choice == 1) {
            response = "#YAS";
        }
        else if (choice == 2) {
            response = "Yes... yes... and YES";
        }
        else if (choice == 3) {
             response = "The stars align. It is a definite yes.";
        }
        else if (choice == 4) {
             response = "Okie doke from me~";
        }
        else if (choice == 5) {
            response = "Yeah, I think so.";
        }
        else if (choice == 6) {
            response = "Never in your life.";
        }
        else if (choice == 7) {
            response = "Well, let's just say you need to get out of there ASAP!";
        }
        else if (choice == 8) {
            response = "Nope, I don't have a good feeling about this.";
        }
        else if (choice == 9) {
            response = "N A H";
        }
        else if (choice == 10) {
            response = "Reply hazy, check back later.";
        }
        else if (choice == 11) {
            response = "One day it shall all become clear.";
        }
        else if (choice == 12) {
            response = "Oh no... you are not gonna like the answer.";
        }
        else if (choice == 13) {
            response = "Idk *_*";
        }
        else if (choice == 14) {
            response = "Maaaybe, try again!";
        }
        else {
            response = "8-BALL ERROR!";
        }

        System.out.println("\nMAGIC 8-BALL SAYS: " + response);

    }

}
