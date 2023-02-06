public class OperacionesMath {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;


        System.out.println(Math.PI);

        //Ceil devuelve entero hacia arriba
        System.out.println(Math.ceil(x));

        //floor devuelve entero hacia abajo
        System.out.println(Math.floor(x));

        //Potencia
        System.out.println(Math.pow(x,y));

        //Devuelve el mayor
        System.out.println(Math.max(x,y));

        //area circulo: pi * r^2
        System.out.println(Math.PI * Math.pow(y,2));

        //area esfera:
        //4PI * R^2
        System.out.println(4*Math.PI * Math.pow(y,2));


        //Volumen esfera:
        //(4/3)PI * r^3
        System.out.println((4/3)*Math.PI * Math.pow(y,3));


    }
}
