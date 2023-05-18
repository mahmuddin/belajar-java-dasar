public class FactorialLoop {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));

        System.out.println(1 * 2 * 3 * 4 * 5);
    }

    static int factorialLoop(int value) {
        var result = 1;
        for (int counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }
}
