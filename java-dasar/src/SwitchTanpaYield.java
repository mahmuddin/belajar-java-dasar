public class SwitchTanpaYield {
    public static void main(String[] args) {
        var nilai ="A";
        String ucapan;

        switch (nilai){
            case "A" -> ucapan = "Wow Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Anda lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda salah jurusan";
        }

        System.out.println(ucapan);
    }
}
