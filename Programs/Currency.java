// sonny li
// cmp 167

import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {

        double p, q, c;
        double total;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of Mexican Pesos: ");
        p = in.nextDouble();

        System.out.print("Enter number of Guatemalan Quetzals: ");
        q = in.nextDouble();

        System.out.print("Enter number of Salvadoran Colons: ");
        c = in.nextDouble();

        total = p * 0.0544 + q * 0.1305 + c * 0.1144;

        System.out.println("US Dollars = " + total);

    }
}
