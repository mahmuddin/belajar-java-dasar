public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 100000000;
        long iniLong2 = 100000000L;

        System.out.println("iniByte :" + iniByte);
        System.out.println("iniShort :" + iniShort);
        System.out.println("iniInt :" + iniInt);
        System.out.println("iniLong :" + iniLong);
        System.out.println("iniLong2 :" + iniLong2);

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        System.out.println("iniFloat :" + iniFloat);
        System.out.println("iniDouble :" + iniDouble);

        int decimalInt = 34;
        int hexDecimal = 0x3124B;
        int binaryDecimal = 0b1010101;

        System.out.println("decimalInt :" + decimalInt);
        System.out.println("hexDecimal :" + hexDecimal);
        System.out.println("binaryDecimal :" + binaryDecimal);

        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        System.out.println("balance :" + balance);
        System.out.println("sum :" + sum);
    }
}
