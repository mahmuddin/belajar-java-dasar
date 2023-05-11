public class Array {
    public static void main(String[] args) {
        // String[] arrayString;
        // arrayString = new String[3];
        // Atau bisa juga dengan
        String[] arrayString = new String[3];

        arrayString[0] = "Mahmuddin";
        arrayString[1] = "Nurul";
        arrayString[2] = "Fajri";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Budi";
        System.out.println(arrayString[0]);

        // Array Initializer
        int[] arrayInt = new int[]{
                10, 90, 80, 67, 29
        };
        System.out.println(arrayInt[1]);

        long[] arrayLong = {
                10, 90, 80, 67, 29
        };
        System.out.println(arrayLong[3]);

        String[] namaPanjang = {
                "Mahmuddin", "Nurul", "Fajri"
        };
        System.out.println(namaPanjang[2]);

        arrayLong[2] = 100;

        System.out.println(arrayLong[1]);
        System.out.println(arrayLong[2]);
        System.out.println(arrayLong.length);

        // Array di dalam Array
        String[][] members = {
                {"Mahmuddin", "Nurul", "Fajri"},
                {"Budi", "Nugraha"},
                {"Joko", "Santoso"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
