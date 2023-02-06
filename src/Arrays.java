public class Arrays {
    public static void main(String[] args) {

        //limitación: debemos especificar el tamaño
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */
        String[][] cities  = new String[4][2];

        //para arreglos en tres dimensiones lo mejor es usar BBDD:
        int [][][] numbers = new int[2][2][2];
        //de cuatro dimensiones:
        int [][][][] numbers4 = new int[2][2][2][2];

        //Cargar informacion array 1 dimension
        androidVersions [0] = "Apple Pie";
        androidVersions [1]= "Bananna Bread";
        androidVersions [2]= "Cupcake";
        androidVersions [3] = "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        System.out.println();  // salto de linea
        System.out.println();  // salto de linea

        //Cargar informacion array 2 dimensiones
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        System.out.println(cities [0][0]);
        System.out.println(cities [0][1]);
        System.out.println(cities [1][0]);
        System.out.println(cities [1][1]);
        System.out.println(cities [2][0]);
        System.out.println(cities [2][1]);
        System.out.println(cities [3][0]);
        System.out.println(cities [3][1]);

        System.out.println("__________________");
        for(String[] pair : cities){
            for(String name : pair) {
                System.out.println(name);
            }
        }
        System.out.println("__________________");

        System.out.println();  // salto de linea
        System.out.println();  // salto de linea

        String [][][][] animals = new String[2][3][2][2];
        animals [1][0][0][1] = "Changuito";

        System.out.println(animals [1][0][0][1]);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }

    }
}
