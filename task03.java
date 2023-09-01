public class task03 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 4;
            int[] ab = new int[3];
            System.out.println(a / b);
            printSum(23, 211);
            int[] abc = new int[ab[1]];
            System.out.println(abc.length);
            abc[3] = 9;
            printSum(abc[0], abc[1]);
            int re = abc[0] + abc[1];
            System.out.println(re);

        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void printSum(int a, int b) {
            System.out.println(a + b);
    }

}
