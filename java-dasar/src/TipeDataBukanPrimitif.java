public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100;

        Integer iniObject = iniInt;

        System.out.println(iniObject);
        // konversi dari bukan primitif ke primitif
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.longValue();

        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(iniFloat);

    }
}
