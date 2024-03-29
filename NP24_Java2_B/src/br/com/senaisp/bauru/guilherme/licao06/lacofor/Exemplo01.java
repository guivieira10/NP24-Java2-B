package br.com.senaisp.bauru.guilherme.licao06.lacofor;

public class Exemplo01 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("7 x "+ i + " = " + (7*i));
		}
		//Contagem Regressiva
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		//For sem as chaves
		for (int i = 0; i < 5; i++) {
			System.out.println("Linha do for");
		}	
		System.out.println("Linha seguinte!");
		//For sem parametros
		for (;;) {
			System.out.println("For infinito");
		}
	}

}
