/* Problema soma_vetor
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - imprimir todos os elementos do vetor 
 * - mostrar na tela a soma e a média dos elementos do vetor 
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double soma, media;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < N; i++) {
			System.out.print(String.format("%.1f ", vet[i]));
		}
		System.out.println();
		
		soma =0;
		for (int i = 0; i < N; i++) {
			soma = soma + vet[i];
		}
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		media = soma / N;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
		
	}

}
