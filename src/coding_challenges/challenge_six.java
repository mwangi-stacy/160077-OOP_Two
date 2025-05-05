package coding_challenges;

import java.util.Scanner;

// Coding challenge six - While Loop
// Reference Lecture 1.2 notes pg 14
public class challenge_six {
    int age, exam_mark;
    String name;

    Scanner scanner = new Scanner(System.in);

    void Driving_Licence() {
        System.out.println("Please enter your full name:");
        name = scanner.nextLine();

        // Loop until both age and exam mark conditions are satisfied
        do {
            System.out.println("Please enter your age:");
            age = scanner.nextInt();

            System.out.println("Enter your driving exam marks:");
            exam_mark = scanner.nextInt();

            if (age < 18 || exam_mark < 55) {
                System.out.println("You are not eligible for a driver's license. Please try again.");
            }

        } while (age < 18 || exam_mark < 55);

        System.out.println("Congratulations " + name + "! You are eligible for a driver's license.");
    }

    public static void main(String[] args) {
        new challenge_six().Driving_Licence();
    }
}
