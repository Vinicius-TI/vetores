package exercicio05;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[12];
        double soma = 0;

        // Lendo os 12 números do usuário
        System.out.println("Digite 12 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        // Calculando a média
        double media = soma / numeros.length;

        // Contando quantos números são maiores que a média
        int acimaDaMedia = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                acimaDaMedia++;
            }
        }

        // Exibindo os resultados
        System.out.printf("\nMédia dos valores: %.2f\n", media);
        System.out.println("Quantidade de números acima da média: " + acimaDaMedia);

        scanner.close();
    }
}