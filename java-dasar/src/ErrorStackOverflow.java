public class ErrorStackOverflow {
    public static void main(String[] args) {
        loop(100);  // Masih bisa
//        loop(10000);  // Error StackOverflow
    }

    static void loop(int value){
        if(value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("loop-" + value);
            loop(value - 1);
        }
    }
}
