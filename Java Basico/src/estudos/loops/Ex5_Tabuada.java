package estudos.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Qual tabuada voce deseja saber: ");
        numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);

        for( int i = 0; i < 11 ; i++){

            System.out.println( numero + " X " + i + " = " + (numero*i));

        }

    }

}
