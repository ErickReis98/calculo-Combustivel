package entities;

public class Veiculo {

	private String nome;
	private double etanolUrbano;
	private double etanolRodovia;
	private double gasolinaUrbano;
	private double gasolinaRodovia;
	private Combustivel combustivel;

	public Veiculo(String nome, double etanolUrbano, double etanolRodovia, double gasolinaUrbano,
			double gasolinaRodovia, Combustivel combustivel) {
		super();
		this.nome = nome;
		this.etanolUrbano = etanolUrbano;
		this.etanolRodovia = etanolRodovia;
		this.gasolinaUrbano = gasolinaUrbano;
		this.gasolinaRodovia = gasolinaRodovia;
		this.combustivel = combustivel;
	}

	public double desempenhoEtanolUrbano() {
		return etanolUrbano / gasolinaUrbano;
	}

	public double desempenhoEtanolRodovia() {
		return etanolRodovia / gasolinaRodovia;
	}

	public double diferencaValor() {
		return combustivel.getEtanol() / combustivel.getGasolina();
	}

	public void desempenho() {
		System.out.println(nome);
		System.out.println("Desempenho Urbano: " + String.format("%.2f", desempenhoEtanolUrbano()));
		System.out.println("Desempenho Rodovia: " + String.format("%.2f", desempenhoEtanolRodovia()));
		System.out.println("Diferenca de valores: " + String.format("%.2f", diferencaValor()));
		auxilioEscolha();
	}

	public void auxilioEscolha() {
		double urbano = desempenhoEtanolUrbano();
		double rodovia = desempenhoEtanolRodovia();
		double valor = diferencaValor();

		System.out.print("Para condução urbana: ");
		calculo(urbano, valor);
		System.out.print("Para condução rodoviaria: ");
		calculo(rodovia, valor);

	}

	public void calculo(double tipo, double valor) {
		if (tipo < valor) {
			System.out.println("Vá de gasolina");
		} else {
			System.out.println("Vá de etanol");
		}
	}

}
