import java.util.InputMismatchException;
import java.util.Scanner;

public class task01 {
    static float num;

    public static float input_float() {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите дробное число =");
                try {
                    String in = input.next();
                    num = Float.parseFloat(in);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Введите корректное число");
                }
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(input_float());
    }

}