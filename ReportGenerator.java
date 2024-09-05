public class ReportGenerator {

    public static void generateReport(User user) {
        System.out.println("----- Report for " + user.getUsername() + " -----");
        double totalExpenses = user.getExpenses().stream().mapToDouble(Expense::getAmount).sum();
        double budget = user.getBudget() != null ? user.getBudget().getAmount() : 0.0;

        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Budget: " + budget);
        System.out.println("Remaining Budget: " + (budget - totalExpenses));
    }
}
