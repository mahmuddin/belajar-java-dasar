public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = sum(a, b);
        var d = 200.45;
        var e = sumDouble(a, d);
        var f = hitung(100, "*", 200);

        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
    }

    // Jika mau return value, maka tidak bisa pakai void
    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static double sumDouble(double value1, double value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            default:
                return 0;
        }
    }
}
