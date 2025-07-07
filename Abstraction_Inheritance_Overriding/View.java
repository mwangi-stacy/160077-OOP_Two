package coding_challenges.Abstraction_Inheritance_Overriding;

public class View implements DataSource {
    @Override
    public void execute() {
        System.out.println("Viewing data...");
    }
}

