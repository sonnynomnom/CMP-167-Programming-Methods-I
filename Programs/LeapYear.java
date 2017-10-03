// Sonny Li
// CMP 167: Programming Methods I

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter month: ");
        int m = in.nextInt();

        System.out.print("Enter day: ");
        int d = in.nextInt();

        System.out.print("Enter year: ");
        int y = in.nextInt();

        System.out.println();

        if (m < 1 || m > 12 || d < 1 || d > 31 || y < 1000 || y > 9999)
        {
            System.out.println("\nInvalid entry.");
        }

        else if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
        {
            System.out.println(m +"/"+ d + "/" + y + " falls on a leap year.");
        }

        else
        {
            System.out.println(m + "/" + d +"/" + y + " doesn't fall on a leap year.");
        }

    }

}
