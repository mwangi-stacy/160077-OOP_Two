package coding_challenges.challenge_seven;
// This coding challenge involves inheritance, overriding and abstraction concepts.

public class Account {
    protected int id;
    protected String name;
    protected DataSource myData;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void performOperation(DataSource myData) {
        this.myData = myData;
        myData.execute();
    }
}

