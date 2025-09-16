package logica;

import java.util.ArrayList;

public class VersionDosCriba {

	// Realizado por Cristal Peralta y Laiyine Suriel
	public static void main(String[] args) {

		long inicio = System.nanoTime();
		int n = 20;
		ArrayList<Integer> resultado = cribaEratostenes(n);
		
		System.out.println("Números primos desde el 2 hasta el " + n + "\n"+  resultado + " ");

		// Tiempo que ejecuta
		long fin = System.nanoTime();
		long tiempo = fin - inicio;
		System.out.println("Tiempo: " + tiempo + " nanosegundos");
	}

	public static ArrayList<Integer> cribaEratostenes(int n) {
		boolean[] nCompuesto = new boolean[n + 1];
		ArrayList<Integer> primos = new ArrayList<>();

		// Proceso de la criba, iniciando desde 2
		for (int i = 2; i <= n; i++) {
			if (!nCompuesto[i]) { 
				primos.add(i);// los posibles numeros primos los va añadiendo a la lista
				for (int j = i * i; j <= n; j += i) { // despues va verificando sus multiplos para quitarlos de la lista 
					nCompuesto[j] = true;
				}
			}
		}
		return primos;
	}
}
