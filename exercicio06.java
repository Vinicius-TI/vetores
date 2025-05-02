package exercicio06;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        // Lendo os 10 elementos do vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Solicitando o número a ser removido
        System.out.print("\nDigite o número que deseja remover: ");
        int numeroRemover = scanner.nextInt();

        // Removendo a primeira ocorrência do número
        boolean encontrado = false;
        int[] novoVetor = new int[9]; // novo vetor com 1 elemento a menos
        int j = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroRemover && !encontrado) {
                encontrado = true; // ignora a primeira ocorrência
                continue;
            }
            if (j < novoVetor.length) {
                novoVetor[j] = vetor[i];
                j++;
            }
        }

        // Exibindo resultado
        if (encontrado) {
            System.out.println("\nVetor após remover o número " + numeroRemover + ":");
            for (int num : novoVetor) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("\nO número " + numeroRemover + " não foi encontrado no vetor.");
        }

        scanner.close();
    
    }
}