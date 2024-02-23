import java.util.Scanner;
public class PasswordSSHTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("[Account Setup]");
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            SSHer userInfo = new SSHer(username, password);
            System.out.println("Your username is " + 
                userInfo.getUsername() + 
                " and your password is " + userInfo.SSH());
        }
    }
}