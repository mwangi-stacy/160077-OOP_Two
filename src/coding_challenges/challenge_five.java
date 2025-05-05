package coding_challenges;
import java.util.Random;
//Coding challenge five - Random
//Reference Lecture 1.2 pg 12

public class challenge_five {

    Random rand = new Random();
    int relationshipreadiness = rand.nextInt(10); // 0 to 11


    void relationship(){
            if (relationshipreadiness < 1) {
                System.out.println("Please try again!");
            }
            else if (relationshipreadiness <= 3) {
                System.out.println("Your relationship readiness score is: "+relationshipreadiness);
                System.out.println("You are looking for a casual realationship.");
            }
            else if (relationshipreadiness <= 6) {
                System.out.println("Your relationship readniness score is: " + relationshipreadiness);
                System.out.println("You are looking for a casual relationship that might turn into something serious.");
            }
            else if (relationshipreadiness <= 10) {
                System.out.println("Your relationship readiness score is: " + relationshipreadiness );
                System.out.println("You are ready for a long-term relationship!");
            }
        }
        public static void main(String[]args){
            (new challenge_five()).relationship();
        }
    }


