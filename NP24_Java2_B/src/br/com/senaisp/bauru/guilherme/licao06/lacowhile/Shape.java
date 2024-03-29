package br.com.senaisp.bauru.guilherme.licao06.lacowhile;

public class Shape {
	public void criarRetangulo(int lar, int alt) {
		if (lar <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figura!");
		} else {
			// Aqui começa o código
			for (int lin = 1; lin <= alt; lin++) {
				for (int col = 1; col <= lar; col++) {
					if (lin == 1 || lin == alt || col == lar || col == 1) {
						System.out.print("#");
					} else {
						System.out.println(" ");
					} // Fim do else
				} // Fim for col
				System.out.println();
			} // Fim for lin
		} // Fim do else
	}// Fim do criarRetangulo

	public void criarTriangulo(int lar, int alt) {
		if (lar <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figura!");
		} else {
			// Aqui começa o código
			for (int lin=1; lin<= alt; lin++) {
				for (int col=1; col<=lar; col++) {
					if (col==1 || col==lin || lin==alt) {
						System.out.print("#");
					} else {
						System.out.println(" ");
					} // Fim do else
				} // Fim for col
				System.out.println();
			} // Fim for lin
		} // Fim do else
	}// Fim do criarTriangulo
}
