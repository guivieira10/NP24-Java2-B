package br.com.senaisp.bauru.guilherme.licao06.lacowhile;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		while(opc < 1 || opc>15 /* Condição */) {
			//Bloco de execução
			System.out.println("Digite um valor entre 1 e 15: ");
			opc = sc.nextInt();
		}
		System.out.println("Fim de Jogo");
		do {
			System.out.println("Digite um valor de 5 a 10: ");
			opc = sc.nextInt();
		} 
		while (opc<5 || opc>10);
		
		sc.close();
	}

}
