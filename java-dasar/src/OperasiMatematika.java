public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 9;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignment
        int c = 100;

        c += 10;
        System.out.println(c);

        c-=10;
        System.out.println(c);

        c *=10;
        System.out.println(c);

        // Unary Operator
        int d = 100;
        int e = -10;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);
    }
}
