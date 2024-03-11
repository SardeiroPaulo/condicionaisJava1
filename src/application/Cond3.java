package application;

import java.util.Scanner;

public class Cond3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caractere para saber se é vogal ou consoante: ");
            char letra = sc.next().charAt(0);

        if(Character.isLetter(letra) && !isVogal(letra)){
            System.out.println("è uma consoante");
        }
        else {
            System.out.println("é uma vogal");
        }




        sc.close();
    }

    private static boolean isVogal(char letra) {
        letra = Character.toUpperCase(letra);
        return letra =='A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
    }
}
