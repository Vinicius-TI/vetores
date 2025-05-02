package exercicio08;
import java.util.Scanner;
import java.util.ArrayList;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        ArrayList<Integer> C = new ArrayList<>();

        // Lendo vetor A
        System.out.println("Digite 5 números para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // Lendo vetor B
        System.out.println("\nDigite 5 números para o vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        // Adicionando elementos únicos de A ao vetor C
        for (int i = 0; i < A.length; i++) {
            if (!C.contains(A[i])) {
                C.add(A[i]);
            }
        }

        // Adicionando elementos únicos de B ao vetor C
        for (int i = 0; i < B.length; i++) {
            if (!C.contains(B[i])) {
                C.add(B[i]);
            }
        }

        // Exibindo o vetor C (união)
        System.out.println("\nVetor C (União dos vetores A e B):");
        for (int num : C) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}