import java.util.HashMap;
import java.util.Scanner;

public class UserManager {
    private HashMap<String, User> users;
    private User currentUser;

    public UserManager() {
        this.users = new HashMap<>();
        this.currentUser = null;
    }

    public void register(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already exists, try another.");
        } else {
            users.put(username, new User(username, password));
            System.out.println("Registration successful.");
        }
    }

    public boolean login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            currentUser = users.get(username);
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid credentials, please try again.");
            return false;
        }
    }

    public void logout() {
        currentUser = null;
        System.out.println("Logged out successfully.");
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
