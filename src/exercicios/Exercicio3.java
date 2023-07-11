package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int[] vetC = new int[10];

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Digite o valor da posição do vetor A: " + i);
            vetA[i] = scan.nextInt();
            System.out.println("Digite o valor da posição do vetor B: " + i);
            vetB[i] = scan.nextInt();
        }

        for (int i = 0; i < vetA.length; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }

        for (int i = 0; i < vetC.length; i++) {
            System.out.println(vetC[i]);
        }
    }
}
