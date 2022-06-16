public class castingEx {
    public static void main(String[] args) {
                char c = 'z'; //Convierto a int
                int int1 = 250; //Convierto a Long y luego de Long a short
                double d1 = 301.067; //Convierto a Long
                int i2 = 100; //Sumo 5000.66 y convierto a float
                int i3 = 737; // Multiplico por 100 y convierto a bytes
                double d2 = 298.638; //Divido entre 25 y lo convierto a long
                //conversion
                System.out.println("1: " + (int) c);
                System.out.println("1.long: " + (long) int1);
                short shortInt = (short) int1;
                System.out.println("1.short: " + shortInt);

                long longD1 = (long) d1;
                System.out.println("3: "+ longD1);
                i2 += 5000.66;
                float floatI2 = (float) i2;
                System.out.println("4:"+ floatI2);

                i3 *= 100;
                byte byteI3 = (byte) i3;
                System.out.println("5: "+byteI3);

                d2 /= 25;
                long longD2 = (long) d2;
        System.out.println("6: "+ longD2);


    }
}
