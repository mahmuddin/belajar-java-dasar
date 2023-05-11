public class KonversiNumber {
    public static void main(String[] args) {
        //Konversi Tipe Data Number
        byte iniByteValue = 10;
        short iniShortValue = iniByteValue;
        int iniIntValue = iniShortValue;
        long iniLongValue = iniIntValue;
        float iniFloatValue = iniLongValue;
        double iniDoubleValue = iniFloatValue;

        System.out.println("iniByteValue :" + iniByteValue);
        System.out.println("iniShortValue :" + iniShortValue);
        System.out.println("iniIntValue :" + iniIntValue);
        System.out.println("iniLongValue :" + iniLongValue);
        System.out.println("iniFloatValue :" + iniFloatValue);
        System.out.println("iniDoubleValue :" + iniDoubleValue);

        float iniFloat2Value = (float) iniDoubleValue;
        long iniLong2Value = (long) iniFloat2Value;
        int iniInt2Value = (int) iniLong2Value;
        short iniShort2Value = (short) iniInt2Value;

        System.out.println("iniFloat2Value :" + iniFloat2Value);
        System.out.println("iniLong2Value :" + iniLong2Value);
        System.out.println("iniInt2Value :" + iniInt2Value);
        System.out.println("iniShort2Value :" + iniShort2Value);

    }
}
