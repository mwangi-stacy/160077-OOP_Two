package coding_challenges.Abstraction_Inheritance_Overriding;
public class Delete implements DataSource {
    @Override
    public void execute() {
        System.out.println("Deleting data...");
    }
}
