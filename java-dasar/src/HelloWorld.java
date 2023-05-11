public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 100000000;
        long iniLong2 = 100000000L;

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        int decimalInt = 34;
        int hexDecimal = 0x3124B;
        int binaryDecimal = 0b1010101;

        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        //Konversi Tipe Data Number
        byte iniByteValue = 10;
        short iniShortValue = iniByteValue;
        int iniIntValue = iniShortValue;
        long iniLongValue = iniIntValue;
        float iniFloatValue = iniLongValue;
        double iniDoubleValue = iniFloatValue;

        float iniFloat2Value = (float) iniDoubleValue;
        long iniLong2Value = (long) iniFloat2Value;
        int iniInt2Value = (int) iniLong2Value;
        short iniShort2Value = (short) iniInt2Value;
    }
}
