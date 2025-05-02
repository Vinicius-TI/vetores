package exercicio02;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

        // Preenchendo o vetor com números fornecidos pelo usuário
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Encontrando o maior valor e sua posição
        int maior = vetor[0];
        int indiceMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
        }

        // Imprimindo o resultado
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Índice do maior valor: " + indiceMaior);

        scanner.close();
    }
}