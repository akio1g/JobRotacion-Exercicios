package exJobRotacion;

import java.util.Scanner;

public class ex5InverterString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = sc.next();
		
		String[] palavraSeparada = palavra.split(""); // separar a palavra no vetor
		
		String[] palavraInvertida = new String[palavraSeparada.length]; // definir tamanho do vetor
		
		int contadorPalavraInvertida = 0;
		
		for(int i = palavraSeparada.length-1; i >= 0; i--) {
			palavraInvertida[contadorPalavraInvertida] = palavraSeparada[i]; // adicionando letra por letra no vetor
			contadorPalavraInvertida += 1;
		}
		String resultadoPalavra = "";
		for(int j = 0; j < palavraInvertida.length; j++) {
			resultadoPalavra += palavraInvertida[j]; // juntando as letras
		}
		System.out.println(resultadoPalavra);
		sc.close();
		
	}

}
