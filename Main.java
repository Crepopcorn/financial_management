import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        U2serManager userManager = new UserManager();
        
        System.out.println("Welcome to the Finance Management System!");
        boolean running = true;

        while (running) {
            System.out.println("1. Login\n2. Register\n3. Exit");
            System.out.print("Choose an option: ");
            int option = Utils.getIntInput(scanner, 1, 3);

            switch (option) {
                case 1:
                    if (userManager.login(scanner)) {
                        userMenu(scanner, userManager);
                    }
                    break;
                case 2:
                    userManager.register(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
        System.out.println("Thank you for using the Finance Management System.");
        scanner.close();
    }

    private static void userMenu(Scanner scanner, UserManager userManager) {
        ExpenseManager expenseManager = new ExpenseManager();
        BudgetManager budgetManager = new BudgetManager();
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("\n1. Add Expense\n2. View Expenses\n3. Set Budget\n4. View Report\n5. Logout");
            System.out.print("Choose an option: ");
            int option = Utils.getIntInput(scanner, 1, 5);

            switch (option) {
                case 1:
                    expenseManager.addExpense(scanner, userManager.getCurrentUser());
                    break;
                case 2:
                    expenseManager.viewExpenses(userManager.getCurrentUser());
                    break;
                case 3:
                    budgetManager.setBudget(scanner, userManager.getCurrentUser());
                    break;
                case 4:
                    ReportGenerator.generateReport(userManager.getCurrentUser());
                    break;
                case 5:
                    loggedIn = false;
                    userManager.logout();
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
