// solicitar 3 números e calcular o maior de 3

package appplication;

import java.util.Scanner;

public class Cond2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int maiorNumero = 0;

            if ( n1 >= n2 && n1 >= n3 ) {
                maiorNumero = n1;
            }
            else if ( n2 >= n1 && n2 >= n3){
                maiorNumero = n2;
            }
            else if ( n3 >= n1 && n3 >= n2) {
                maiorNumero = n3;
            }


        System.out.println("O maior número é: " + maiorNumero);

    }
}
