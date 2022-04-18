package br.com.erickfreire.somamatrizes;

import java.util.Scanner;

/**
 * Programa que calcula a soma entre duas matrizes
 * @author Erick Freire
 * @version 1 - Criado em 17-04-2022
 */

public class SomaMatrizes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i;
		int j;
		int[][] matrizA = new int[5][3];
		int[][] matrizB = new int[5][3];
		int[][] matrizC = new int[5][3];
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 3; j++) {
				System.out.print("Digite um número inteiro: ");
				matrizA[i][j] = entrada.nextInt();				
			}			
		}
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 3; j++) {
				System.out.print("Digite um número inteiro: ");
				matrizB[i][j] = entrada.nextInt();				
			}			
		}
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 3; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];			
			}			
		}
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 3; j++) {
				System.out.printf("%d ", matrizC[i][j]);			
			}
			System.out.println();
		}		

	}

}
