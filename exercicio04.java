package exercicio04;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[8];

        // Lendo os 8 elementos do usuário
        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Exibindo o vetor na ordem inversa
        System.out.println("\nVetor na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("Elemento " + (i + 1) + ": " + vetor[i]);
        }

        scanner.close();
    }
}