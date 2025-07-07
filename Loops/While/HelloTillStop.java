package coding_challenges.Loops.While;
import java.util.Scanner;

public class HelloTillStop {
    Scanner sc = new Scanner (System.in);
    //Method to output Hello while user wants
    void ShowHello(){
        //Guard variable
        String choice;

        System.out.println("For Hello type h, anything else to stop");
        choice=sc.next(); // Set guard variable

        while("h".equals(choice)){
            System.out.println("Hello");//check guard
            choice=sc.next();//update guard variable

        }
    }
    //Main method to execute the file
    public static void main(String []args){
        (new HelloTillStop()).ShowHello();

    }

}
