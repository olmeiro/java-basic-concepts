public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //operadores de asignación
        System.out.println("a = b:" +  (a == b));
        System.out.println("a != b:" +  (a != b));

        //operadores relacionales:
        System.out.println("a > b:" +  (a > b));
        System.out.println("a < b:" +  (a < b));
        System.out.println("a >= b:" +  (a >= b));
        System.out.println("a <= b:" +  (a <= b));

        if( a == b) {
            System.out.println("a = b: if " +  (a == b));
        }else if(a != b) {
            System.out.println("a != b: if " +  (a != b));
        }else if(a > b){
            System.out.println("a > b: if " +  (a > b));
        }
    }
}
