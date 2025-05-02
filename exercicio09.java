package exercicio09;

import java.util.Scanner;
import java.util.ArrayList;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[6];
        int[] B = new int[6];
        ArrayList<Integer> C = new ArrayList<>();

        // Lendo vetor A
        System.out.println("Digite 6 números para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // Lendo vetor B
        System.out.println("\nDigite 6 números para o vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        // Encontrando interseção e armazenando em C
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j] && !C.contains(A[i])) {
                    C.add(A[i]);
                }
            }
        }

        // Exibindo o vetor C (interseção)
        System.out.println("\nVetor C (Elementos comuns entre A e B):");
        if (C.isEmpty()) {
            System.out.println("Nenhum elemento em comum.");
        } else {
            for (int num : C) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}