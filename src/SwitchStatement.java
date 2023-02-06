public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark1";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Light mode.");
                break;

            case "Night":
                System.out.println("Night mode.");
                break;
            case  "Blue dark":
                System.out.println("Blue mode.");
                break;
            case "Dark":
                System.out.println("Dark mode.");
                break;
            default:
                System.out.println("Selecciona una opción correcta");
        }
    }
}

//Los casos que se evaluen deben ser del mismo tipo.