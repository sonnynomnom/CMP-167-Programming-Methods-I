// sonny li
// cmp 167

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        double a, b, c;
        double root1, root2;

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        a = in.nextDouble();

        System.out.print("Enter b: ");
        b = in.nextDouble();

        System.out.print("Enter c: ");
        c = in.nextDouble();

        root1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        root2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);

        System.out.println("Root 1 is " + root1);
        System.out.println("Root 2 is " + root2);

    }
}
