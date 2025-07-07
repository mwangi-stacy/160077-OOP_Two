package coding_challenges.Abstraction_Inheritance_Overriding;

public class Admin extends Account {
    private String authPassword;

    public Admin(int id, String name, String password) {
        super(id, name);
        this.authPassword = password;
    }
}
