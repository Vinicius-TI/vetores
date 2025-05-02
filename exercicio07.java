package exercicio07;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

        // Lendo os 15 elementos do vetor
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Solicitando o número a ser contado
        System.out.print("\nDigite um número para contar as ocorrências: ");
        int numero = scanner.nextInt();

        // Contando as ocorrências
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                contador++;
            }
        }

        // Exibindo o resultado
        System.out.println("\nO número " + numero + " aparece " + contador + " vez(es) no vetor.");

        scanner.close();
    }
}
