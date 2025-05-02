public class exercicio01 {
    public static void main(String[] args) {
        // Criando o vetor com 10 números inteiros
        int[] numeros = {5, 8, 2, 10, 3, 7, 6, 4, 1, 9};

        int soma = 0;

        // Calculando a soma dos elementos
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // Imprimindo o resultado
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}