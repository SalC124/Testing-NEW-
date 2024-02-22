import java.util.Scanner;
public class PasswordSSHTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("What is your userame?");
            String username = input.nextLine();
            System.out.println("What is your password?");
            String password = input.nextLine();
            SSHer userInfo = new SSHer(username, password);
            System.out.println("Your username is " + userInfo.getUsername() + " and your password is " + userInfo.SSH());
        }
    }
}