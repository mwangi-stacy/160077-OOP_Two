package coding_challenges;

//Reference Lecture 1.2, pg 7

import java.util.Scanner;

public class challenge_two {
    Scanner scanner= new Scanner(System.in);

    void calculatetotalAmount(){
        double amount = 32, total_amount;
        int quantity;

        System.out.println("Please enter amount of sweets sold:");
        quantity=scanner.nextInt();

        total_amount=quantity*amount;

        System.out.println("The total amount you will earn for "+quantity+" sweets is "+total_amount+" shillings");

    }
    public static void main(String[]args){
        (new challenge_two()).calculatetotalAmount();
    }
}
