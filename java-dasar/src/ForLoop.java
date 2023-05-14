public class ForLoop {
    public static void main(String[] args) {
        // Perualangan tanpa henti
//        for (;;){
//            System.out.println("Perulangan");
//        }

        // Perulagan dengan kondisi
        var counter = 1;
        for (; counter <= 10; ) {
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        }

        System.out.println(counter);

        // Perulangan dengan init statement
        for (var counter_2 = 1; counter_2 <= 10; ) {
            System.out.println("Perulangan Ke - " + counter_2);
            counter_2++;
        }

        // Perulangan dengan Post Statement
        for (var counter_3 = 1; counter_3 <= 10; counter_3++) {
            System.out.println("Perulangan Ke - " + counter_3);
        }

    }
}
