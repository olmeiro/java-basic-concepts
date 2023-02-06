public class Functions {
    /*
    *Comentario de varias lineas
    *
     */
    public static void main(String[] args) {
        double y = 3;

        //area circulo
        double area = circleArea(y);
        System.out.println(area);

        //area esfera:
        double areaEsfera = sphereArea(y);
        System.out.println("areaEsfera: " + areaEsfera);

        //Volumen esfera:
        double volEsfera = sphereVolume(y);
        System.out.println("volEsfera: " + volEsfera);

        //Cambio de moneda

        System.out.println("Peso MXN a dolar: " + converToDolar(200, "MXN"));
        System.out.println("Peso COP a dolar: " + converToDolar(1000, "COP"));
    }

    //Las funciones deben vivir al nivel del scope de la clase:
    //static: aplica para metodos que comparten el método main ->

    /**
     * Comentario de JAVADocs
     * tiene tags para especiales
     */
    public static double circleArea(double radio){
        return   Math.PI * Math.pow(radio,2);
    }

    public static double sphereArea(double radio){
        return 4 * Math.PI * Math.pow(radio,2);
    }

    /**
     * @param radio
     * @return
     */
    public static double sphereVolume(double radio) {
        return  (4/3) * Math.pow(radio,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares.
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     */
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case   "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
