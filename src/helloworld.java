import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {

        //2.Variables in Java
        int year_of_birth, age;

        float temperature;
        String your_name, day_week;
        String age_group;


        Scanner myObj = new Scanner(System.in);

        // Enter your name and press Enter
        System.out.println("Enter your name please:");
        your_name = myObj.nextLine();

        //Enter the current day of the week
        System.out.println("What day of the week is it:");
        day_week = myObj.nextLine();

        //Enter your year of birth
        System.out.println("What year were you born?");
        year_of_birth = myObj.nextInt();
        age = 2024 - year_of_birth;

        do{
            System.out.println("Please enter a valid date of birth.");
            year_of_birth= myObj.nextInt();
            age= 2024 - year_of_birth;
        }
        while (age<=0||year_of_birth>2024);


//      //Enter the day's temperature
        System.out.println("Please enter today's temperature");
        temperature = myObj.nextFloat();



        if(age<=2){
            age_group="Toddler";
        } else if (age<=5) {
            age_group="Preschooler";
        }else if (age<=8) {
            age_group = "Primary-schooler";
        }else if(age<=12){
            age_group= "Pre-teen";
        }else if (age<=17){
            age_group="Teenager";
        }else if(age<=35){
            age_group="Adult youth";
        }else if(age<=65){
            age_group="Middle aged";
        }else{
            age_group="Elderly";
        }
//Print out your name and age before your age group
        System.out.println("My name is " + your_name + " and I am " + age + " years old");

//
        switch(age_group) {
            case "Toddler":
                System.out.println("I am " + age + "years old hence I am a toddler");
                break;
            case "Preschooler":
                System.out.println("I am " + age + " years old hence I am a preschooler");
                break;
            case "Primary-schooler":
                System.out.println(" I am " + age + "years old hence I am a primary schooler");
                break;
            case "Pre-teen":
                System.out.println("I am " + age + "years old hence I am a pre-teen");
                break;
            case "Teenager":
                System.out.println("I am " + age + " years old hence I am a teenager");
                break;
            case "Adult youth":
                System.out.println("I am " + age + " years old hence I am an adult in the youth category");
                break;
            case "Middle aged":
                System.out.println("I am " + age + " years old hence I am a middle-aged person");
                break;
            case "Elderly":
                System.out.println("I am " + age + " years old hence I am an elderly");
                break;
            default:
                System.out.println("You age does not place you in any age group");
        }

        System.out.println(day_week + "'s temperature is " + temperature + " degrees celsius");
//        System.out.println()
    }
}