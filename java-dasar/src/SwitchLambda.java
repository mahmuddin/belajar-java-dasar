public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai){
            case "A" -> System.out.println("Wow Anda Lulus dengan baik");
            case "B", "C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }
    }
}
