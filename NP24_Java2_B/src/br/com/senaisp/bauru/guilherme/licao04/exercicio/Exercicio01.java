package br.com.senaisp.bauru.guilherme.licao04.exercicio;

public class Exercicio01 {

	public static void main(String[] args) {
		MetodosCalculo mc = new MetodosCalculo();
		double tempC = mc.converterF2C(60.5);
		System.out.println("Temperatura em ºC é "+ tempC);
		//Calculando a hipotenusa
		double hip = mc.calcularHipotenusa(15, 10);
		System.out.println("Hipotenusa é "+ hip);
		//Sorteando os valores
		System.out.println("Valores dos dados foi "+ mc.jogarDados());
	}

}
