// Sonny Li
// CMP 167: Programming Methods I

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        double tempf;
        double tempc;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter temp in Fahrenheit: ");
        tempf = in.nextDouble();

        tempc = (tempf - 32) * 5 / 9;
        
        System.out.printf("The current temp is %.1f degrees Celsius.\n", tempc);

    }

}
