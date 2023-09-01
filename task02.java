public class task02 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,54,6,6,7,2};
        intArray[8] = Integer.parseInt("dsadasd");
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}