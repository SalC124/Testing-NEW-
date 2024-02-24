import java.util.Scanner;
public class PasswordSSHTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("[Account Setup]");

            // Get user data
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            // Create a new SSHer object to save user info
            SSHer userInfo = new SSHer(username, password, 
                SSHMultiplier.getMultiplier());
            System.out.println("Your username is " + 
                userInfo.getUsername() + 
                " and your password was SSHed into " + 
                userInfo.SSH());

            // Compare user data
            System.out.print("Username: ");
            username = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            // Create a new SSHer object to compare user data
            SSHer compareUserData = new SSHer(username, password, SSHMultiplier.getMultiplier());
            if(userInfo.SSH() == compareUserData.SSH()) {
                System.out.println("Your passwords match!");
            } else {
                System.out.println("Your passwords do not match!");
            }
            
        }
    }
}