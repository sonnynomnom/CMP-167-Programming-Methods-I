/* Bryant Henning */
/* Fun Fact: I play Eve Online. */

import java.util.Scanner;

public class Add {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, total = 0;

        System.out.print("Number: ");
        num = input.nextInt();

        System.out.println();

        for (int x = 1; x <= num; x++)
        {

            System.out.print(x + " ");

            total = total + x;

        }

        System.out.println("\nThe sum is " + total + ".");

    }

}
