import java.util.InputMismatchException;
import java.util.Scanner;

public class task04 {
    public static void input_string() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Введите строку");
            String in = input.nextLine();
            if (in.equals("")) {
                System.out.println("Нельзя вводить пустые строки");
                throw new RuntimeException("Введена пустая Строка");
            }
            System.out.println(in);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        input_string();
    }
}
