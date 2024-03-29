package br.com.senaisp.bauru.guilherme.licao06.lacofor;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o número que deseja a tabuada: ");
		int num = sc.nextInt();
		for (int i = 1; i<=10; i++) {
			System.out.println(num + " x "+ i +" = " + (num*i) );
		}
		sc.close();
	}

}
