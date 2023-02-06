public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        //postfija: primero accede al dato y luego incrementa o decrementa
        lives--;
        System.out.println(lives);
        lives++;
        System.out.println(lives);

        //forma prefija: obtiene el dato incrementado
        //Gana un regalo por ganar una vida
//        int gift = 100 + lives++;
//        System.out.println(gift);

        int gift = 100 + ++lives;
        System.out.println(gift);


    }
}
