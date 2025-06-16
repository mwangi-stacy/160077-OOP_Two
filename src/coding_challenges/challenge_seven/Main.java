package coding_challenges.challenge_seven;

public class Main {
    public static void main(String[] args) {
        //Creating objects for the User and Admin classes
        Admin admin = new Admin(1, "Alice", "securePass123");
        User user = new User(2, "Bob");

        //Creating objects that will enable us to use overridden methods inherited from the DataSource interface
        DataSource update = new Update();
        DataSource view = new View();
        DataSource delete = new Delete();

        //Calling the performOperation methods in regards to operation and account being used
        admin.performOperation(update);
        user.performOperation(view);
        admin.performOperation(delete);
    }
}

