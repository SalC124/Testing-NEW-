import java.util.Scanner;
public class jefryIsStupidTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("how many jefry is stupid?");
            int Jefry = input.nextInt();
            for(int i = 0; i < Jefry; i++){
                System.out.println("jefry is stupid");
            }
        }
    }
}