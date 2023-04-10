import java.util.ListResourceBundle;

public class main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        long actual = service.calculate(5000, true);
        System.out.println(expected + " == ? == " + actual);
    }
}