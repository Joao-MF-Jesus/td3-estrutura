//João marcelo ferreira de jesus
package view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("=== Preenchendo o array com 10 números inteiros ===");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número [" + (i + 1) + "]: ");
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("\nO maior número presente no array é: " + maior);
        scanner.close();
    }
}
