public class SwitchDenganYield {
    public static void main(String[] args) {
        var nilai = "A";

        String ucapan = switch (nilai) {
            case "A":
                yield "Wow Anda lulus dengan baik";
            case "B", "C":
                yield "Anda lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Mungkin Anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
