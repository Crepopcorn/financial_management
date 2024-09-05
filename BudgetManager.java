import java.util.Scanner;

public class BudgetManager {

    public void setBudget(Scanner scanner, User user) {
        System.out.print("Enter monthly budget: ");
        double budgetAmount = Utils.getDoubleInput(scanner);

        Budget budget = new Budget(budgetAmount);
        user.setBudget(budget);

        System.out.println("Budget set successfully.");
    }
}
