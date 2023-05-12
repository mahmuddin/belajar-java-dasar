public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;  //false
        var lulusNilaiAKhir = nilaiAkhir >= 75; //true

        var lulus = lulusAbsen && lulusNilaiAKhir;
        System.out.println(lulus);
    }
}
