// sonny li
// cmp 167

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Enter a degree in Celsius: ");
        celsius = in.nextDouble();

        fahrenheit = celsius * 1.8 + 32.0;

        System.out.println("The degree in Fahrenheit is " + fahrenheit);

    }
}
