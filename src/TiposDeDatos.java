public class TiposDeDatos {
    public static void main(String[] args) {
        // int : tiene un límite de diez digitos
        int n = 1234567890;
        //para números más grandes:
        // Long:
        long nL = 123456789012345L;

        //Flotantes->
        // Double:
        double nD = 123.456123456;

        // Float
        float nF = 123.456F;

        //byte, short, int, long
        System.out.println("bits tipo byte:" + Byte.SIZE);
        System.out.println("bytes tipo byte:" + Byte.BYTES);
        System.out.println("valor minimo tipo byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte:" + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo short:" + Short.SIZE);
        System.out.println("bytes tipo short:" + Short.BYTES);
        System.out.println("valor minimo tipo short:" + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short:" + Short.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo int:" + Integer.SIZE);
        System.out.println("bytes tipo int:" + Integer.BYTES);
        System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo long:" + Long.SIZE);
        System.out.println("bytes tipo long:" + Long.BYTES);
        System.out.println("valor minimo tipo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);

        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);
        short shortVar = 32767;
        System.out.println("shortVar = " + shortVar);
        int intVar = 2147483647;
        System.out.println("intVar = " + intVar);
        long longVar = 9223372036854775807L;
        System.out.println("longVar = " + longVar);

        var numero = 10;
        System.out.println("numero = " + numero);

        //Tipos de datos char y boolean:
        //char lo usamos con comilla simple:
        char unaLetra = 'u';


        //inferencia de tipos como en JS:
        var salary = 1000; //int
        var pension = salary*0.03; //double
        var totalSalary = salary - pension; //double

        var employeeName = "Anahi";
    }
}
