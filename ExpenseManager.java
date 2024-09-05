import java.util.Scanner;

public class ExpenseManager {

    public void addExpense(Scanner scanner, User user) {
        System.out.print("Enter expense description: ");
        String description = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = Utils.getDoubleInput(scanner);

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        Expense expense = new Expense(description, amount, category);
        user.getExpenses().add(expense);

        System.out.println("Expense added successfully.");
    }

    public void viewExpenses(User user) {
        if (user.getExpenses().isEmpty()) {
            System.out.println("No expenses found.");
        } else {
            System.out.println("Your expenses:");
            for (Expense expense : user.getExpenses()) {
                System.out.println(expense);
            }
        }
    }
}
