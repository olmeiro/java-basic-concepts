public class Casting {
    public static void main(String[] args) {
        //En un año ubicar 30 perritos
        //Cuantos perrito ubique al mes

        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs); //2.5 perritos, mejor hacemos casting

        //Estimación: se trunca el número decimal (elimina)
        int estimatedMontlyDogs = (int) monthlyDogs;
        System.out.println("estimatedMontlyDogs: " + estimatedMontlyDogs);

        //EXACTITUD:
        int a = 30;
        int b = 12;
        System.out.println("30/12: " + (double) a/b);

        int x = 30;
        int y = 12;

        double z = x / y;
        System.out.println("x/y: " + z);

        //hagamos la exactitud de la division:
        double u = (double) x / y;
        System.out.println("U: " + u);

        //llevar un char a int
        char n = '1';
        int nI = n;
        System.out.println(nI); //ASCII = 1

        short nS = (short) n;
        System.out.println(nS);

        //práctica:
        char c = 'z';
        int cInt =  c;
        System.out.println("cIn: " +  cInt);

        int i = 250;
        long iLong = i;
        System.out.println("iLong: " +  iLong);
        short iLongShort = (short) iLong;
        System.out.println("iLongShort: " + iLongShort);

        double d = 301.367;
        long dLong = (long) d;
        System.out.println("dLong: " + dLong);

        int g = 100;
        double gAdd = g + 5000.66;
        System.out.println("gAdd " + gAdd);
        float gAddFloat = (float) gAdd;
        System.out.println("gAddFloat " + gAddFloat);

        int i2 = 100;
        double ia = 5000.66;
        float i2F = i2 + (float) ia;
        System.out.println("i2F: " + i2F);

        int k = 100;
        var kAdd = k + 5000.66;
        double kAddDouble = kAdd;
        System.out.println("kAddDouble " + kAddDouble);

        int r = 737;
        int r100 = r * 100;
        byte r100Byte = (byte) r100;
        System.out.println("r100Byte " + r100Byte);


        double h = 298.638;
        var hDiv = h / 25;
        System.out.println("hDiv " + hDiv);
        long hDivDouble = (long) hDiv;
        System.out.println(hDivDouble);


    }
}
