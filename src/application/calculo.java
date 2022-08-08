package application;

import java.util.Scanner;

import entities.Combustivel;
import entities.Veiculo;

public class calculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Combustivel C = new Combustivel(3.79, 5.29);
		
		Veiculo polo = new Veiculo("Polo", 6.2, 8.1, 9.4, 12.1, C);
		Veiculo focus = new Veiculo("Focus", 6.5, 8.7, 9.7, 12.9, C);
		Veiculo civic = new Veiculo("Civic", 6.5, 8.6, 10.6, 13.9, C);
		Veiculo hb20 = new Veiculo("HB20", 6.9, 8.2, 10, 11.7, C);

		polo.desempenho();
		System.out.println("-----------------------");

		focus.desempenho();
		System.out.println("-----------------------");

		civic.desempenho();
		System.out.println("-----------------------");

		hb20.desempenho();

		sc.close();
	}

}
