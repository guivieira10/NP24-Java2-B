package br.com.senaisp.bauru.guilherme.licao08.exercicios;

import java.util.Scanner;

public class JogoBlackJack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Baralho br = new Baralho();
		String jogador1, jogador2;
		int score1 = 0, score2=0;
		//Pedindo os nomes
		System.out.println("Digite o nome do jogador 1: ");
		jogador1 = sc.nextLine();
		
		System.out.println("Digite o nome do jogador 2: ");
		jogador2 = sc.nextLine();
		//Gerando as cartas para o Jogador 1
		System.out.println("Mostrando as cartas do player 1...");
		Carta ct = br.getCartaAleatoria();
		score1 += ct.getValor();
		System.out.println(ct);
		
		ct = br.getCartaAleatoria();
		score1 += ct.getValor();
		System.out.println(ct);
		
		System.out.println("Mostrando as cartas do player 2...");
		ct = br.getCartaAleatoria();
		score2 += ct.getValor();
		System.out.println(ct);
		
		ct = br.getCartaAleatoria();
		score2 += ct.getValor();
		System.out.println(ct);
		//Verificando com o jogador 1 se deseja mais cartas
		System.out.println("Hora do player 1 receber cartas...");
		String cond = "S";
		while(cond.equals("S")) {
			System.out.println("Deseja mais cartas? (S/N)");
			cond = sc.nextLine();
			//Se sim, sorteamos uma carta
			if (cond.equals("S")) {
				ct = br.getCartaAleatoria();
				score1 += ct.getValor();
				System.out.println(ct);
			}
		}
		//Agora vamos ao jogador 2
		System.out.println("Hora do player 2 receber cartas...");
		do {
			System.out.println("Deseja mais cartas? (S/N)");
			cond = sc.nextLine();
			
			//Se sim, sorteamos uma carta
			if (cond.equals("S")) {
				ct = br.getCartaAleatoria();
				score2 += ct.getValor();
				System.out.println(ct);
			}
			
		}while (cond.equals("S"));
		//Hora do vencedor!!
		if (score1 == score2) {
			System.out.println("Empate !!!");
		} else if (score1>score2 && score1>22) {
			System.out.println(jogador1 + " você é o vencedor!");
		} else if (score2>score1 && score2<22) {
			System.out.println(jogador2 + " você é o vencedor!");
		} else {
			System.out.println("Ninguem venceu!!");
		}
		//Fechando o scanner
		sc.close();
	}
}
