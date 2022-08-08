package entities;

public class Combustivel {
	private double etanol;
	private double gasolina;

	public Combustivel(double etanol, double gasolina) {
		super();
		this.etanol = etanol;
		this.gasolina = gasolina;
	}

	public double getEtanol() {
		return etanol;
	}

	public void setEtanol(double etanol) {
		this.etanol = etanol;
	}

	public double getGasolina() {
		return gasolina;
	}

	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}

}
