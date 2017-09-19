// Sonny Li
// CMP 167: Programming Methods I

import java.util.Scanner;

public class SpaceBoxer {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double weight;
        int x;

        System.out.print("Please enter your current earth weight: ");
        weight = in.nextDouble();

        System.out.println("\nI have information for the following planets:");
        System.out.println("   1. Venus   2. Mars    3. Jupiter");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune\n");

        System.out.print("Which planet are you visiting? " );
        x = in.nextInt();

        if (x == 1)
        {
            weight = weight * 0.78;
        }
        else if (x == 2)
        {
            weight = weight * 0.39;
        }
        else if (x == 3)
        {
            weight = weight * 2.65;
        }
        else if (x == 4)
        {
            weight = weight * 1.17;
        }
        else if (x == 5)
        {
            weight = weight * 1.05;
        }
        else if (x == 6)
        {
            weight = weight * 1.23;
        }

        System.out.printf("\nYou weight would be %.2f pounds on that planet.\n", weight);

    }

}
