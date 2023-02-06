import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        //cuando usamos un menú de opciones para los usuarios:
        do{
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("GRacias por visitarnos");
                    break;
                case 1:
                    System.out.println("movies");
                    break;
                case 2:
                    System.out.println("Series");
                default:
                    System.out.println("Selecciona una opción correcta");
            }

        }while(response != 0);

        System.out.println("Se terminó el programa");
    }
}
