package estudos.loops;
import java.util.Scanner;

public class Ex4ParEImpar {

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numero;
        int quantPares = 0, quantImpares = 0;

    System.out.println("Quantidade de numeros: ");
    quantNumeros = scan.nextInt();

    do{
        System.out.println("Qual numero: ");
        numero = scan.nextInt();

        if(numero % 2 == 0) quantPares++;
        else quantImpares++;

        count++;

    }while(count < quantNumeros);

    System.out.println("Numeros pares: " + quantPares );
    System.out.println("Numeros impares: " + quantImpares);

    }

}
