public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 80, 85, 80, 75, 80, 80};
        sayCongrats("Mahmuddin", values);

        sayCongratsWithVariableArgument("Mahmuddin", 74, 50, 76, 75, 67);  // ini bisa
        sayCongratsWithVariableArgument("Mahmuddin", values);  // ini juga bisa
    }

    // Method tanpa Variable Argument (dengan array)
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        // cari rata-rata nilai Mahmuddin
        var findValues = total / values.length;

        if (findValues >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }

    // Method dengan Variable Argument
    static void sayCongratsWithVariableArgument(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        // cari rata-rata nilai Mahmuddin
        var findValues = total / values.length;

        if (findValues >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }
}
