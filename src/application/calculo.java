package application;

import java.util.Scanner;

import entities.Combustivel;
import entities.Veiculo;

public class calculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Valores do etanol e gasolina no valor de R$
		
		Combustivel C = new Combustivel(3.79, 5.29);
		
		
		// Nessa instancia segue: Nome veiculo, consumo etanol urbano, consumo etanol na rodovia,
		// consumo gasolina urbano e consumo gasolina na rodovia, e como ultimo argumento o parametro dos preços do combustivel 
		// que estão armazenados na variavel C
		
		Veiculo polo = new Veiculo("Polo", 6.2, 8.1, 9.4, 12.1, C);
		Veiculo focus = new Veiculo("Focus", 6.5, 8.7, 9.7, 12.9, C);
		Veiculo civic = new Veiculo("Civic", 6.5, 8.6, 10.6, 13.9, C);
		Veiculo hb20 = new Veiculo("HB20", 6.9, 8.2, 10, 11.7, C);

		// Esse programa seria de utilidade public se ao invés de digitar manualmente os valores 
		// fosse consumida uma API com os parametros de consumo do veiculo
		
		polo.desempenho();
		System.out.println("---------------------");

		focus.desempenho();
		System.out.println("---------------------");

		civic.desempenho();
		System.out.println("---------------------");

		hb20.desempenho();

		sc.close();
	}

}
