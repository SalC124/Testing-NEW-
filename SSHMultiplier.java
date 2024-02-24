import java.lang.Math;
public class SSHMultiplier {
    private static int multiplier = (int) (Math.random() * 10) + 2;
    public static int getMultiplier() {
        return multiplier;
    }
}