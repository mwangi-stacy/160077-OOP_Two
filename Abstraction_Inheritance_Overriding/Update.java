package coding_challenges.Abstraction_Inheritance_Overriding;

public class Update implements DataSource {
    @Override
    public void execute() {
        System.out.println("Updating data...");
    }
}


