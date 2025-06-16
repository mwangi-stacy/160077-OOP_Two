package coding_challenges;
//Coding Challenge 1 - A basic class with a method calling that class

import java.util.Scanner;

public class challenge_one {
    int age;
    String name;

    Scanner sc=new Scanner(System.in);
    void getDetails(){
        System.out.println("Please enter your first name: ");
        name= sc.nextLine();

        System.out.println("Please enter your age");
        age=sc.nextInt();

        System.out.println("Your name is "+name+ " and you are " +age);

    }
    public static void main(String []args){
        (new challenge_one()).getDetails();
    }
}
