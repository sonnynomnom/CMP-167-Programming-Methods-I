// Sonny Li
// CMP 167: Programming Methods I

import java.util.Scanner;

public class Quiz {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int answer1, answer2, answer3;
        int score = 0;
        
        System.out.print("Are you ready for a quiz? ");
        
        in.nextLine();
        
        System.out.println("Okay, here it comes!\n");
        
        // ============ Question 1 ============
        
        System.out.println("Q1) What is the capital of Alaska?");
        System.out.println("     1) Melbourne");
        System.out.println("     2) Anchorage");
        System.out.println("     3) Juneau\n");
        
        answer1 = in.nextInt();
        
        if (answer1 == 3)
        {
            System.out.println("\nThat's right!\n");
            score++;
        }
        else
        {
            System.out.println("\nThat's wrong!\n");
        }
        
        // ============ Question 2 ============
        
        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
        System.out.println("     1) Yes");
        System.out.println("     2) No\n");
        
        answer2 = in.nextInt();
        
        if (answer2 == 2)
        {
            System.out.println("\nGood job!\n");
            score++;
        }
        else
        {
            System.out.println("\nSorry, \"cat\" is a string. ints can only store numbers.\n");
        }
        
        // ============ Question 3 ============
        
        System.out.println("Q3) What is the result of 9+6/3");
        System.out.println("     1) 5");
        System.out.println("     2) 11");
        System.out.println("     3) 15/3\n");
        
        answer3 = in.nextInt();
        
        if (answer3 == 2)
        {
            System.out.println("\nThat's correct!\n");
            score++;
        }
        else
        {
            System.out.println("\nThat's incorrect!\n");
        }
        
        // =============== OVER ===============
        
        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.println("Thanks for playing!");
        
    }
    
}