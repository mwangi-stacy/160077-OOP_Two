package coding_challenges.challenge_seven;

public class Admin extends Account {
    private String authPassword;

    public Admin(int id, String name, String password) {
        super(id, name);
        this.authPassword = password;
    }
}
