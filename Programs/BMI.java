// Sonny Li
// CMP 167: Programming Methods I

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        double height, weight, bmi;

        Scanner in = new Scanner(System.in);

        System.out.print("Type in your height (m): ");
        height = in.nextDouble();

        System.out.print("Type in your weight (kg): ");
        weight = in.nextDouble();

        bmi = weight / (height * height);

        System.out.printf("Your BMI is %.1f\n", bmi);

    }
}
