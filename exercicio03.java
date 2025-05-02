package exercicio03;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int contadorPares = 0;

        // Lendo os 20 números inteiros do usuário
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verifica se o número é par
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        // Exibe a quantidade de números pares
        System.out.println("\nQuantidade de números pares: " + contadorPares);

        scanner.close();
    }
}
