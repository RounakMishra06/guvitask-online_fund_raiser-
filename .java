import java.util.*;

class User {
    private String name;
    private String email;
    private double donation;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.donation = 0.0;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void donate(double amount) {
        if (amount > 0) {
            donation += amount;
            System.out.println("Thank you, " + name + ", for donating $" + amount);
        } else {
            System.out.println("Donation amount must be positive.");
        }
    }

    public double getDonation() {
        return donation;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Total Donations: $" + donation;
    }
}

public class FundraisingPlatform {
    private static Map<String, User> users = new HashMap<>();
    private static double totalFunds = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Online Fundraising Platform!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Register User");
            System.out.println("2. Donate Funds");
            System.out.println("3. View User Donations");
            System.out.println("4. View Total Funds Raised");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Clear buffer

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    donateFunds(scanner);
                    break;
                case 3:
                    viewUserDonations(scanner);
                    break;
                case 4:
                    viewTotalFunds();
                    break;
                case 5:
                    System.out.println("Thank you for supporting the cause!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void registerUser(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if (users.containsKey(email)) {
            System.out.println("User with this email already exists.");
        } else {
            users.put(email, new User(name, email));
            System.out.println("Registration successful for " + name);
        }
    }

    private static void donateFunds(Scanner scanner) {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if (users.containsKey(email)) {
            System.out.print("Enter the amount you want to donate: ");
            double amount = scanner.nextDouble();
            User user = users.get(email);
            user.donate(amount);
            totalFunds += amount;
        } else {
            System.out.println("User not found. Please register first.");
        }
    }

    private static void viewUserDonations(Scanner scanner) {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if (users.containsKey(email)) {
            System.out.println(users.get(email));
        } else {
            System.out.println("User not found.");
        }
    }

    private static void viewTotalFunds() {
        System.out.println("Total Funds Raised: $" + totalFunds);
    }
}
