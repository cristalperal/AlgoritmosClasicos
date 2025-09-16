package logica;

import java.util.Scanner;

public class VersionUnoCriba {

	// Realizado por Cristal Peralta y Laiyine Suriel
	public static void main(String[] args) {
		long inicio = System.nanoTime();
		Scanner leer = new Scanner(System.in);
		System.out.println("Diga un valor para N:");
		int n = leer.nextInt();
		int[] nPrimos = cribaEratostenes(n);

		System.out.println("Resultado: ");
		for (int i = 2; i <= n; i++) {
			if (nPrimos[i] != 0) {
				System.out.println(i + " ");
			}
		}
		// Tiempo que ejecuta
		long fin = System.nanoTime();
		long tiempo = fin - inicio;
		System.out.println("Tiempo: " + tiempo + " nanosegundos");
	}

	public static int[] cribaEratostenes(int n) {
		int[] nPrimos = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			nPrimos[i] = i;
		}
		// Proceso de la criba, iniciando desde 2
		for (int p = 2; p * p <= n; p++) { // El proceso finaliza cuando el cuadrado del ultimo numero primo confirmado es mayor que n
			if (nPrimos[p] != 0) { // Si es diferente de 0 siginifica que es verdadero, es decir, que es primo
				for (int j = p * p; j <= n; j += p) {
					nPrimos[j] = 0;
				}
			}
		}
		return nPrimos;
	}
}