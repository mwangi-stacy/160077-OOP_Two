package coding_challenges;
import java.util.Scanner;

//Coding challenge four for using Scanner
//Reference - Lecture 1.2 pg 11
public class challenge_four {
    int age;
    String first_name, second_name, third_name, course_name;

    Scanner sc=new Scanner(System.in);

    void getDetails(){
        System.out.println("Please enter your first name: ");
        first_name= sc.nextLine();

        System.out.println("Please enter your second name: ");
        second_name= sc.nextLine();

        System.out.println("Please enter your third name: ");
        third_name= sc.nextLine();

        System.out.println("Please enter your course of choice: ");
        course_name= sc.nextLine();

        System.out.println("Please enter your age");
        age=sc.nextInt();



        System.out.println("Your name is "+first_name+" "+second_name+" "+third_name);
        System.out.println("You are "+age+" old");
        System.out.println("You are currently pursuing "+course_name);

    }
    public static void main(String []args){
        (new challenge_four()).getDetails();
    }
}


