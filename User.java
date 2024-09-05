import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Expense> expenses;
    private Budget budget;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.expenses = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
}
