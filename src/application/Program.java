//verificar se um número é positivo negativo ou zero com if/else

package application;

public class Program {
    public static void main(String[] args) {

        int n = -4;

        if (n > 0) {
            System.out.println("Número positivo");
        }
        else if ( n < 0){
            System.out.println("Número negativo");
        }
        else {
            System.out.println("Número igual a zero");
        }

    }
}
