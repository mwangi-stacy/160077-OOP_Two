package coding_challenges;

import java.util.Scanner;

//Coding challenge 3, if...else condtion
//Reference lecture 1.2 pg 8
public class challenge_three {

    int marks;
    String name, std_grade;

    Scanner sc = new Scanner(System.in);

    public void getGrade() {
        System.out.println("Please enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your total marks for the subject:");
        marks = sc.nextInt();

        if (marks >= 85) {
            std_grade = "A";
        } else if (marks >= 80) {
            std_grade = "A-";
        } else if (marks >= 75) {
            std_grade = "B+";
        } else if (marks >= 70) {
            std_grade = "B";
        } else if (marks >= 65) {
            std_grade = "B-";
        } else if (marks >= 60) {
            std_grade = "C+";
        } else if (marks >= 55) {
            std_grade = "C";
        } else if (marks >= 50) {
            std_grade = "C-";
        } else if (marks >= 45) {
            std_grade = "D+";
        } else if (marks >= 40) {
            std_grade = "D";
        } else {
            std_grade = "Fail";
        }
    }

    public static void main(String[] args) {
        challenge_three student = new challenge_three();
        student.getGrade();
        System.out.println("Student: " + student.name + " | Grade: " + student.std_grade);
    }
}
