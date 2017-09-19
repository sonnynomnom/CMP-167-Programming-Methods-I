// Sonny Li
// CMP 167: Programming Methods I

import java.util.Scanner;

public class pH {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double ph;

        System.out.print("Enter pH level (0-14): ");
        ph = in.nextDouble();

        if (ph > 7)
        {
            System.out.println("Basic");
        }
        else if (ph < 7)
        {
            System.out.println("Acidic");
        }
        else
        {
            System.out.println("~Neutral~");
        }

    }

}
